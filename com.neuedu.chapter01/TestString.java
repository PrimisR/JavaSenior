import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class TestString {
    public static void main(String[] args) {
        //char[]->String
        char[] arr={'a','b','��'};
        String str=new String(arr);
        System.out.println(str);//ab��

        //String->char[]
        String str2="�������";
        char[] arr2=str2.toCharArray();
        for(char c:arr2) {
            System.out.print(c);
        }
        System.out.println();
        //String->byte[]
        String a="�Ұ����й�";
        byte[] b={};
        //�쳣��������쳣���Ǽ�����쳣
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
        System.out.println(newstr);//����ƽ̨Ĭ�ϱ���
        //��֤��ɢ�ɶ����Ƶı�����������һ��
    }
}