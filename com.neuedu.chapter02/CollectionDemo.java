import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class CollectionDemo
{
    public static void main(String[] args) {
        // ���ϣ�����һ�����ݣ����������������ͣ��Զ�����
        // ���飺����һ�����ݣ���������/�������ͣ�����
        // �ӿڣ�
        /*Collection ���ԣ����м��ϣ�
        * List �������ظ�
        *1.ArrayList ����Arrayʵ�֣���������ٶȿ�
        *2.LinkedList  ��������ʵ�֣�����ɾ����
        * Set �������ظ�
        * HashSet
        */
        //Map �����ԣ�˫�м��ϣ�<K,V>

        //���ͣ����Ͳ�����<T>
        List list=new ArrayList<>(20);//ֱ��ָ��û������
        list.add("hello");
        list.add("hello");
        list.add(true);
        System.out.println(list);

        for(Object obj:list)
            System.out.println(obj);

        List<String> list2=new ArrayList<>();

        LinkedList<String> list3=new LinkedList<>();//Ҫ��������չ
        list3.add("abc");
        list3.add("def");
        list3.add("ghi");

        for(String str:list3) System.out.println(str);

        Set<String> set=new HashSet();
        set.add("1");
        set.add("1");
        set.add("5");
        set.add("3");

        System.out.println(set);
    }
}