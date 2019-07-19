public class TestStringBuffer
{
    public static void main(String[] args) {
        StringBuffer buffer=new StringBuffer("hello");
        //append
        buffer.append("world");
        System.out.println(buffer);//helloworld

        buffer.insert(2, "a");
        System.out.println(buffer);//healloworld

        //替换
        buffer.setCharAt(2, 'w');//接受单个char
        System.out.println(buffer);

        //删除
        buffer.delete(0,3);//删除前三个（不包含第四个）
        System.out.println(buffer);

        /*StringBuilder和StringBuffer的区别
        *1.StringBuilder是线程不安全的，StringBuffer是线程安全的
        *2.在单线程下，StringBuilder的性能好
        */

        StringBuilder builder=new StringBuilder("haha");
        builder.setCharAt(2, 'a');
    }
}