import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TestBufferedReader
{
    public static void main(String[] args) {
        try ( 
            Reader r=new FileReader("Example.txt");
            BufferedReader br=new BufferedReader(r);

        )
        {
            String line;//return String/null//\n,\r,EOF
            while((line=br.readLine())!=null)
            {
                System.out.println(line);
            }

        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();;
        }
    }
}