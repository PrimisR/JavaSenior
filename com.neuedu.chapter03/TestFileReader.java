import java.io.Reader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class TestFileReader
{
    public static void main(String[] args) {
        Reader r=null;
        try {
            r=new FileReader("Example.txt");

            int num=r.read();//0 to 65535//65535Á½¸ö×Ö½Ú
            while(num!=-1)
            {
                System.out.print((char)num);
                num=r.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally
        {
            try {
                r.close();
            } catch(IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}