public class TestStringBuffer
{
    public static void main(String[] args) {
        StringBuffer buffer=new StringBuffer("hello");
        //append
        buffer.append("world");
        System.out.println(buffer);//helloworld

        buffer.insert(2, "a");
        System.out.println(buffer);//healloworld

        //�滻
        buffer.setCharAt(2, 'w');//���ܵ���char
        System.out.println(buffer);

        //ɾ��
        buffer.delete(0,3);//ɾ��ǰ���������������ĸ���
        System.out.println(buffer);

        /*StringBuilder��StringBuffer������
        *1.StringBuilder���̲߳���ȫ�ģ�StringBuffer���̰߳�ȫ��
        *2.�ڵ��߳��£�StringBuilder�����ܺ�
        */

        StringBuilder builder=new StringBuilder("haha");
        builder.setCharAt(2, 'a');
    }
}