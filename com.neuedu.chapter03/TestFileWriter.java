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
                w.close();//��Ҫ�ر�������flush,���FW�еĻ�����
            //�Ѿ����ڴ滺����д�룬����û��д���ĵ���
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
*/

        //try_resources ֱ�ӹر���
        try (Writer w=new FileWriter("Output.txt",true)) {
            w.write("hehehe");
            w.write(97);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}