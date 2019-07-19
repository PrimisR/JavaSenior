public class TestGenericDemo
{
    public static void main(String[] args) {
        Info<String,Integer> info=new Info<>("Tom", 30);
        Demo2<Info<String,Integer>> demo=new Demo2<>(info);
    }
   /* 泛型类好处：
    * 1.减少类中重载方法数量
    * 2.对于集合类来说，可以限定放入集合中的数据类型，
    * 并且取出元素的时候，不用强制类型转换
    *  */
}

class Info<K,V>
{
    private K k;
    private V v;

    public Info(K k,V v)
    {
        this.v=v;
        this.k=k;
    }
}

class Demo2<T>
{
    private T t;

    public Demo2(T t)
    {
        this.t=t;
    }
}