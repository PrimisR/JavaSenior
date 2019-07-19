public class TestSingleton
{
    public static void main(String[] args) {
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        Singleton s3=Singleton.getInstance();

        System.out.println(s1); System.out.println(s2); System.out.println(s3);
        //类被加载到内存 1.调用类的static方法 2.new一个对象 3.调用class.forName()(JDBC)
    }
}