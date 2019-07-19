public class TestGeneric
{
    public static void main(String[] args) {
        //Demo d=new Demo();
        //d.fun(10);
        
        //String是final，没有子类，没有extends，父类是Object
        //泛型不支持向上转型

        String[] arr=fun1("1","2","3","4","5");
        fun2(arr);
        fun2(fun1(1,2,3,4,5,"Hehe"));

    }

    public static <T> T[] fun1(T...arg)//Type safety?
    {
        return arg;
    }

    public static <T> void fun2(T[] arr)
    {
        for(T item:arr)
        {
            System.out.println(item);
        }
    }
}

class Demo
{
    public <T> T fun(T t) //泛型方法
    {
        return t;
    }
}