public class TestSingleton
{
    public static void main(String[] args) {
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        Singleton s3=Singleton.getInstance();

        System.out.println(s1); System.out.println(s2); System.out.println(s3);
        //�౻���ص��ڴ� 1.�������static���� 2.newһ������ 3.����class.forName()(JDBC)
    }
}