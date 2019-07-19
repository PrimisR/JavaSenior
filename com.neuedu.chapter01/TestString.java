import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class TestString {
    public static void main(String[] args) {
        //char[]->String
        char[] arr={'a','b','中'};
        String str=new String(arr);
        System.out.println(str);//ab中

        //String->char[]
        String str2="你好世界";
        char[] arr2=str2.toCharArray();
        for(char c:arr2) {
            System.out.print(c);
        }
        System.out.println();
        //String->byte[]
        String a="我爱你中国";
        byte[] b={};
        //异常：检查性异常，非检查性异常
        byte[] bb=a.getBytes(StandardCharsets.UTF_8);
        for(byte c:bb) {
            System.out.print(c+" ");
        }
        System.out.println();
        
        try {
            b=a.getBytes("utf-8");
        }
        catch(UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        for(byte item:b) {
            System.out.println(item);
        }

        //byte[]->String
        String newstr=new String(b);
        System.out.println(newstr);//按照平台默认编码
        //保证打散成二进制的编码和重组编码一样
    }
}