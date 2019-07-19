import java.io.File;
public class Practice
{
    public static void main(String[] args) {
        //给定目录，递归遍历目录下所有文件，列出文件名
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