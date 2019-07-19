import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet
{
    public static void main(String[] args) {
        Set<Integer> redballs=new TreeSet<>();

        Random r=new Random();

        while(redballs.size()<6)
        {
            int num=r.nextInt(33)+1;
            redballs.add(num); //自动排序，自动装箱
        }

        int blueball=r.nextInt(16)+1;

        //打印，set遍历:Iterator,for-each,set没有下标
        Iterator<Integer> it=redballs.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println(blueball);
        
        for(Integer i:redballs)
            System.out.println(i);
    }
}