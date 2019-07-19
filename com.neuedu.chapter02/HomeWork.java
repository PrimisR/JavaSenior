import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class HomeWork
{
    public static Scanner scanner=new Scanner(System.in);

    private static void HomeWork1()
    {
        Queue<String> q=new Queue<>();
        System.out.println(q.isEmpty());
        q.put("a");
        System.out.println(q.isEmpty());
        q.put("b");
        q.put("c");
        System.out.println(q.get());
        System.out.println(q.get());
        System.out.println(q.get());
        System.out.println(q.isEmpty());
    }

    private static void HomeWork2()
    {
        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i=1;i<=5;i++) arrayList.add(i);
        Iterator<Integer> it=arrayList.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }

    private static void HomeWork3()
    {
        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("apple");
        treeSet.add("grape");
        treeSet.add("banana");
        treeSet.add("pear");
        System.out.println(treeSet.last());
        System.out.println(treeSet.first());
        //Collections.max()/.min()
        for(String str:treeSet)
            System.out.println(str);
    }

    private static void HomeWork4()
    {
        String line=scanner.nextLine();
        String[] words=line.split("\\s+");
        List<String> list=new ArrayList<>();
        for(String item:words) list.add(item);
        Collections.sort(list,new StringComparator());
        list.forEach(System.out::println);//¡ùforEach()
    }
    public static void main(String[] args) {
        //HomeWork1();
        //HomeWork2();
        //HomeWork3();
        HomeWork4();
    }

    
}

class Queue<T>
{
    private LinkedList<T> linklist;

    public Queue()
    {
        linklist=new LinkedList<>();
    }

    public void put(T e)
    {
        linklist.add(e);
    }

    public T get( )
    {
        T first=null;
        try {
            first=linklist.getFirst();//throw exception
        }
        catch(NoSuchElementException e)
        {
            e.printStackTrace();
        }
        linklist.removeFirst();
        return first;
    }

    public boolean isEmpty()
    {
        return linklist.isEmpty();
    }
}

class StringComparator implements Comparator<String>
{
    public int compare(String o1, String o2)
    {   
        return o1.toLowerCase().compareTo(o2.toLowerCase());
    }
}