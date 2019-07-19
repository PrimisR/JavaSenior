import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class TestObjectOutputStream
{
    public static void main(String[] args) {
        Student s=new Student();
        s.setId(1);
        s.setName("Jack");
        Student s1=new Student();
        s1.setId(2);
        s1.setName("Tom");
        //可以设计成一个列表的方式

        List<Student> list=new ArrayList<>();
        list.add(s);
        list.add(s1);

        try (
            OutputStream out=new FileOutputStream("ObjOutput.data");
            ObjectOutputStream oos=new ObjectOutputStream(out);
        )
        {
            //oos.writeObject(s);
            //oos.writeObject(s1);
            oos.writeObject(list);
        } catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}

class Student implements Serializable//所有都要支持序列化
{
    private static final long serialVersionUID=1L;

    private int id;
    private String name;
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

}