import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TestFileInputStream
{
    public static void main(String[] args) {
        try {//BufferedInputStream
            InputStream in=new FileInputStream("Example.txt");
/*            
            System.out.println(in.read());//ascii
            System.out.println((char)in.read());
            System.out.println((char)in.read());
            System.out.println((char)in.read());
            System.out.println((char)in.read());
            System.out.println((char)in.read());
            System.out.println((char)in.read());
            System.out.println((char)in.read());
            System.out.println((char)in.read());
            System.out.println(in.read());//ascii
            System.out.println(in.read());
            System.out.println((char)in.read());
            System.out.println((char)in.read());
            in.close();
*/
/*
            int c=in.read();
            while(c!=-1)
            {
                System.out.print((char)c);
                c=in.read();
            }
            in.close(); 
*/
        byte[] b=new byte[30];//中文不行
        in.read(b);
        for(byte item:b)
        {
            if(item!=0)
                System.out.print((char)item);
        }
        in.close();
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}