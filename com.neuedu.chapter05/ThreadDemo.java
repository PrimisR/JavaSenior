public class ThreadDemo extends Thread//(Thread implements Runnable)
{
    private boolean flag =true;
    
    public void setFlag(boolean flag){this.flag=flag;}

    public void run()
    {
        
        for(int i=0;i<100;i++)
        {
            if(flag) {
            System.out.println("sub  ThreadPrint:"+i);
            Thread.yield();//让出cpu
            }
            else break;
        }
    }

    public static void main(String[] args)
    {
        //create a thread instance
        ThreadDemo td=new ThreadDemo();
        //start告诉cpu，线程就绪，等待cpu调度
        td.start();
        for(int i=0;i<100;i++)
        {
            if(i==33) td.setFlag(false);
            System.out.println("main  ThreadPrint:"+i);
        }//可能一个时间片内打印多个
    }
}