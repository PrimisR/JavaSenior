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
            redballs.add(num); //�Զ������Զ�װ��
        }

        int blueball=r.nextInt(16)+1;

        //��ӡ��set����:Iterator,for-each,setû���±�
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