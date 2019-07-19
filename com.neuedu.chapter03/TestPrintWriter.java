import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

//PrintWriter>BufferedWriter
public class TestPrintWriter
{
    public static void main(String[] args) {
        try(
            Writer w=new FileWriter("Output.txt",true);

            PrintWriter pw=new PrintWriter(w);

        )
        {
            pw.println("first line");
            pw.println("second line");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}