import java.io.File;
public class Practice
{
    public static void main(String[] args) {
        //����Ŀ¼���ݹ����Ŀ¼�������ļ����г��ļ���
        giveList(new File("C:/Users/29112/Desktop/VS Code Java/"));
    }

    public static void giveList(File file)
    {
        File[] fileList=file.listFiles();
        for(File items:fileList)
        {
            System.out.println(items);
            if(items.isDirectory())
                giveList(items);
        }
    }

    public static void listFiles(File f)
    {
        if(f.isDirectory())
        {
            File[] items = f.listFiles();
            for(File item:items)
            {
                listFiles(item);
            }
        }
        else
        {
            
        }
    }
}