public class TestGenericDemo
{
    public static void main(String[] args) {
        Info<String,Integer> info=new Info<>("Tom", 30);
        Demo2<Info<String,Integer>> demo=new Demo2<>(info);
    }
   /* ������ô���
    * 1.�����������ط�������
    * 2.���ڼ�������˵�������޶����뼯���е��������ͣ�
    * ����ȡ��Ԫ�ص�ʱ�򣬲���ǿ������ת��
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