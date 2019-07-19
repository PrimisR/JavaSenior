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
                    list.wait();//�ͷ���,�߳��ڵȴ�
                } catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }//���ѽ��̺���������޷���ȥ��Ҫ����wait�������������Ѻ���������Ĵ���add object����
            list.add(new Object());
            System.out.println("[Producer: "+Thread.currentThread().getName()+"] produce an object,current storage: "+list.size());

            //����list����ȴ��ص�һ���߳�
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