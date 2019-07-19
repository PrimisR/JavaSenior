import java.io.File;
import java.io.IOException;

public class TestFile
{
    public static void main(String[] args) {
        //constructor
        File f=new File("C:\\Users\\29112\\Desktop\\VS Code Java\\a.txt");
        if(!f.exists())
        {
            try
            {
                f.createNewFile();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
        /*else
        {
            f.delete();
        }*/

        //get file information
        f.renameTo(new File("C:/Users/29112/Desktop/VS Code Java/b.txt"));

        System.out.println(f.getName());
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.getParent());

        //增加目录
        File f2=new File("C:/Users/29112/Desktop/VS Code Java/File");//正斜杠只需要一个
        f2.mkdirs();

        f2.getParentFile();//得到父级文件夹
        
        File f3=new File("C:/Users/29112/Desktop/VS Code Java/com.neuedu.chapter01");

        String[] files=f3.list();
        File[] _files=f3.listFiles();
        for(String str:files) System.out.println(str);
        for(File file:_files) System.out.println(file);
    }
}