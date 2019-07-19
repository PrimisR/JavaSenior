public class TicketBox extends Thread//implements Runnable
{
    private static int tickets=500;

    private Object o=new Object();

    @Override
    public void run() {

        //锁的是谁？//t1:1)cpu执行权　2)获得对象锁
        //锁住当前对象，也可以锁别的对象
        
        while(tickets>0)//大判断可能两个线程同时判断完毕，但时间片切换
        {
            synchronized(TicketBox.class) {//synchronized(this)拿到当前对象同步锁,//obj
                if(tickets>0)//二次判断
                {
                    tickets--;
                    System.out.println(Thread.currentThread().getName()+" 卖出了第 "+(tickets+1)+" 张票");
                    //setTicket();
                }
            }
        }
        //锁什么时候加上去的，什么时候释放的
        //在运行synchronized代码块加上去，结束时释放
    }

    public synchronized static void setTicket2()//锁的是类
    {

    }

    public synchronized void setTicket()//所有synchronized只有一个线程跑一个方法(锁的是对象)
    {
        if(tickets>0)
        {
            tickets--;
            System.out.println(Thread.currentThread().getName()+" 卖出了第 "+(tickets+1)+" 张票");
        }
    }

    public static void main(String[] args) {
        /*TicketBox tb=new TicketBox();
        Thread t1=new Thread(tb);
        Thread t2=new Thread(tb);
        t1.start();
        t2.start();*/

        Thread t1=new TicketBox();
        Thread t2=new TicketBox();//锁O，锁this都不行，不是同一个Object
        t1.start();
        t2.start();
    }
}