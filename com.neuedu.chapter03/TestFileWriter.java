import java.io.Writer;
import java.io.IOException;
import java.io.FileWriter;

public class TestFileWriter
{
    public static void main(String[] args) {
    //BufferedWriterX//PrintWriter
/*        Writer w=null;
        try {
            w=new FileWriter("Output.txt",true);

            w.write("hehehe");
            w.write(97);
            //w.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                w.close();//需要关闭流或者flush,冲出FW中的缓冲区
            //已经在内存缓冲中写入，但并没有写到文档中
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
*/

        //try_resources 直接关闭流
        try (Writer w=new FileWriter("Output.txt",true)) {
            w.write("hehehe");
            w.write(97);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}