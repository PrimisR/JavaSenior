import java.io.IOException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class TestFileOutputStream
{
    public static void main(String[] args) {
        try {
            //true means append rather than rewritex
            OutputStream out=new FileOutputStream("Output.txt",true);

            String str="�Ұ����й�abca";
            byte[] b=str.getBytes("utf-8");

            out.write(b);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}