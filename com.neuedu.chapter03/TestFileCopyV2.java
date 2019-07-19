import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

public class TestFileCopyV2
{
    public static void main(String[] args) {

        Date st=new Date();

        try (
            InputStream in=new FileInputStream("Example.txt");
            InputStream bin=new BufferedInputStream(in);

            OutputStream out=new FileOutputStream("Output.txt");
            OutputStream bout=new BufferedOutputStream(out);
        )
        {
            byte[] b=new byte[1024];
            int len=bin.read(b);
            while(len!=-1)
            {
                bout.write(b,0,len);
                len=bin.read(b);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }  
        
        Date ed=new Date();
        System.out.println(ed.getTime()-st.getTime());
    }
}