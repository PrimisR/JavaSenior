import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;

public class TestFileCopy
{
    public static void main(String[] args) {
        InputStream in=null;
        OutputStream out=null;
        Date st=new Date();
        try {
            in=new FileInputStream("Example.txt");
            out=new FileOutputStream("Output.txt");

            byte[] buffer=new byte[1<<35];
            //read
            int len=in.read(buffer,0,1<<35);//��һЩ�ַ�,���ض������ַ���
            
            while(len!=-1)
            {
                out.write(buffer,0,len);//����Ϊ�õ���ͬһ��buffer��
                //д��������Ҫ���Ƴ��ȣ�
                //�����д����һ�ζ������ļ�
                len=in.read(buffer);
            }
        }catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try{
                in.close();
                out.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
        Date ed=new Date();
        System.out.println(ed.getTime()-st.getTime());
    }
}