public class TestWrapper
{
    public static void main(String[] args) {
        //primitive type ->wrapper
        int a=10;
        Integer _a=new Integer(a);//Deprecated
        Integer __a=Integer.valueOf(a);//use Integer.valueOf()

        long b=20;
        Long _b=new Long(b);
        Long __b=Long.valueOf(b);

        //wrappper -> primitive

        Integer x=new Integer(100);
        int _x=x.intValue();

        //string->wrapper
        String str="10";

        Integer _str=new Integer(str);
        Integer $str=Integer.valueOf(str);

        System.out.println(_str);
        System.out.println($str);

        //wrapper->string
        Byte bb=Byte.valueOf((byte)20);//javaĬ��int,����Byteû�й��캯��
        Byte _bb=20;

        //string->primitive type
        String str2="20";
        int _str2=Integer.parseInt(str2);
        long $str2=Long.parseLong(str2);

        //�Զ�װ��
        Integer i=100;//������class�ɿ�
        //Integer i=new Integer(100) X
        //����ԭ���valueOfһ��
        //�Զ�����
        int _ii=i;

        Integer a1=10;
        Integer a2=10;
        System.out.println(a1==a2);//(-128~127�����ڳ�����)
        //return true
        Integer b1=129;
        Integer b2=129;
        System.out.println(b1==b2);//������Χ���൱��new
        //return false

        Integer c1=Integer.valueOf(10);
        Integer c2=Integer.valueOf(10);
        System.out.println(c1==c2);

        Integer d1=Integer.valueOf(128);
        Integer d2=Integer.valueOf(128);
        System.out.println(d1==d2);
    }
}