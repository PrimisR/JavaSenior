import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadSleep
{
    public static void main(String[] args) {
        while(true)
        {
            //get current data
            Date now = new Date();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String str = sdf.format(now);
            System.out.print("\r"+str);
            //等1秒
            try{
                Thread.sleep(1000);//哪个线程调用这句话，就让该线程睡眠一秒
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}