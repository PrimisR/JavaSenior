import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class TestObjectInputStream
{
    public static void main(String[] args) {
        try (
            InputStream in=new FileInputStream("ObjOutput.data");
            ObjectInputStream ois=new ObjectInputStream(in);
        ) 
        {
            /*Student s=(Student)ois.readObject();

            System.out.println(s.getId());
            System.out.println(s.getName());

            Student s1=(Student)ois.readObject();

            System.out.println(s1.getId());
            System.out.println(s1.getName());*/
            List<Student> list=(List<Student>)ois.readObject();
            //JSON øÁ”Ô—‘£¨ø…∂¡
            System.out.println(list);
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}