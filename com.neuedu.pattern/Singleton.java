public class Singleton
{
    //饿汉式
    //private static Singleton instance = new Singleton();

    //用类名.方法调用
/*  public static Singleton getInstance()
    {
        return instance;
    }
*/

    private Singleton()//构造器私有
    {

    }

    //懒汉式 容易产生线程安全问题,要加锁
    private static Singleton instance;
    
    public synchronized static Singleton getInstance()
    {
        if(instance==null) instance=new Singleton();
        return instance;
    }
}
/**
 * 1）工具类
 * 2）没有属性
 * 好处：
 * 一个对象，节省资源
 * static方法
 */