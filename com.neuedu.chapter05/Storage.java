import java.util.ArrayList;
import java.util.List;

public class Storage
{
    private final int MAX_SIZE=10;
    private List<Object> list=new ArrayList<>();

    public void produce()
    {
        synchronized(list)
        {
            while(list.size()>=MAX_SIZE)
            {
                //full
                try {
                    list.wait();//释放锁,线程在等待
                } catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }//唤醒进程后如果爆仓无法出去，要继续wait，否则被其他唤醒后会继续下面的代码add object爆仓
            list.add(new Object());
            System.out.println("[Producer: "+Thread.currentThread().getName()+"] produce an object,current storage: "+list.size());

            //唤醒list对象等待池的一个线程
            list.notifyAll();
        }
    }

    public void comsume()
    {
        synchronized(list)
        {
            if(list.size()==0)
            {
                try {
                    list.wait();
                } catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
            else
            {
                list.remove(0);
            System.out.println("[Consumer: " + Thread.currentThread().getName()
            + "] consume an object,current storage: " + list.size());
            list.notifyAll();
            }
        }
    }
}