public class TestString2
{
    public static void main(String[] args) {
        String str="helloworld";
        //indexOf�����жϰ���
        System.out.println(str.indexOf("ll"));//2
        System.out.println(str.indexOf("a"));//-1

        System.out.println(str.lastIndexOf("l"));//8

        //split
        String str2="aa1bb2cc";
        String[] arr=str2.split("\\d");//��\ת�壬\�������ַ�
        //������ʽ��\d��������
        //split����������ʽ
        for(String s:arr)
            System.out.println(s);

        String _str2="aa   bb cc    dd";
        // \s��ʾ�հ��ַ���+��ʾһ������
        String[] _arr=_str2.split("\\s++");
        for(String s:_arr)
            System.out.println(s);

        String __str2="aa.bb.cc.dd";
        //"."��������ʽ�Ĺؼ����ţ�д����\\����ת��
        String[] __arr=__str2.split("\\.");
        for(String s:__arr)
            System.out.println(s);

        String str3="helloworld";
        System.out.println(str3.replace("l", "a"));
    }
}