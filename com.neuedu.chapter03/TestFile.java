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

        //����Ŀ¼
        File f2=new File("C:/Users/29112/Desktop/VS Code Java/File");//��б��ֻ��Ҫһ��
        f2.mkdirs();

        f2.getParentFile();//�õ������ļ���
        
        File f3=new File("C:/Users/29112/Desktop/VS Code Java/com.neuedu.chapter01");

        String[] files=f3.list();
        File[] _files=f3.listFiles();
        for(String str:files) System.out.println(str);
        for(File file:_files) System.out.println(file);
    }
}