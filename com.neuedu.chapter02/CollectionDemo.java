import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class CollectionDemo
{
    public static void main(String[] args) {
        // 集合：保存一组数据，保存引用数据类型，自动扩容
        // 数组：保存一组数据，保存引用/基本类型，定长
        // 接口：
        /*Collection 线性（单列集合）
        * List 有序有重复
        *1.ArrayList 基于Array实现，随机访问速度快
        *2.LinkedList  基于链表实现，插入删除快
        * Set 无序无重复
        * HashSet
        */
        //Map 非线性（双列集合）<K,V>

        //泛型：类型参数化<T>
        List list=new ArrayList<>(20);//直接指定没有扩容
        list.add("hello");
        list.add("hello");
        list.add(true);
        System.out.println(list);

        for(Object obj:list)
            System.out.println(obj);

        List<String> list2=new ArrayList<>();

        LinkedList<String> list3=new LinkedList<>();//要用子类拓展
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