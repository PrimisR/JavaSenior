public class TicketBox extends Thread//implements Runnable
{
    private static int tickets=500;

    private Object o=new Object();

    @Override
    public void run() {

        //������˭��//t1:1)cpuִ��Ȩ��2)��ö�����
        //��ס��ǰ����Ҳ��������Ķ���
        
        while(tickets>0)//���жϿ��������߳�ͬʱ�ж���ϣ���ʱ��Ƭ�л�
        {
            synchronized(TicketBox.class) {//synchronized(this)�õ���ǰ����ͬ����,//obj
                if(tickets>0)//�����ж�
                {
                    tickets--;
                    System.out.println(Thread.currentThread().getName()+" �����˵� "+(tickets+1)+" ��Ʊ");
                    //setTicket();
                }
            }
        }
        //��ʲôʱ�����ȥ�ģ�ʲôʱ���ͷŵ�
        //������synchronized��������ȥ������ʱ�ͷ�
    }

    public synchronized static void setTicket2()//��������
    {

    }

    public synchronized void setTicket()//����synchronizedֻ��һ���߳���һ������(�����Ƕ���)
    {
        if(tickets>0)
        {
            tickets--;
            System.out.println(Thread.currentThread().getName()+" �����˵� "+(tickets+1)+" ��Ʊ");
        }
    }

    public static void main(String[] args) {
        /*TicketBox tb=new TicketBox();
        Thread t1=new Thread(tb);
        Thread t2=new Thread(tb);
        t1.start();
        t2.start();*/

        Thread t1=new TicketBox();
        Thread t2=new TicketBox();//��O����this�����У�����ͬһ��Object
        t1.start();
        t2.start();
    }
}