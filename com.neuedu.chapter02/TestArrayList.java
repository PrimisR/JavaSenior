import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestArrayList
{
    public static void main(String[] args) {
        //ArrayList�������飬���ԣ��ڲ���ַ������������ʿ�
        //LinkedList �����ڴ��ַ�����������������������ɾ����

        //LinkedList ��ͷ��Ԫ�غ�β��Ԫ�ز����ṩ��api������ʵ�ֶ��кͶ�ջ

        //List list = new ArrayList<>();

        //list.add("Tom");
        
        //String str=(String)list.get(0); //return Object

        List<String> list=new ArrayList<>();
        list.add("Tom");
        list.add("Jack");
        list.add("Joe");

        Iterator<String> it=list.iterator();
        while(it.hasNext())
        {
            String name=it.next();
            System.out.println(name);
        }

        ListIterator lit=list.listIterator();
        lit.hasPrevious();

        //list ����
        //for(int i=0;i<list.size();i++) get
        //for(String item:list)
        //iterator

    }
}