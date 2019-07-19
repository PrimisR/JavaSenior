import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestArrayList
{
    public static void main(String[] args) {
        //ArrayList基于数组，线性，内部地址连续，随机访问快
        //LinkedList 链表，内存地址不连续，随机访问慢，插入删除快

        //LinkedList 对头部元素和尾部元素操作提供了api，用来实现队列和堆栈

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

        //list 遍历
        //for(int i=0;i<list.size();i++) get
        //for(String item:list)
        //iterator

    }
}