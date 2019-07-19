import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.*;

public class TestDate
{
    public static void main(String[] args) {
        //1.获取当前系统时间
        Date now=new Date();
        System.out.println(now);

        long time=now.getTime();//1970.1.1 00:00:00 GMT+0

        Date now2=new Date();
        System.out.println(now.equals(now2));
        System.out.println(now.compareTo(now2));//now在now2前,-1

        //Calendar
        //1.Calendar is singleton
        //2.getInstance method return child class of Calendar
        Calendar c=Calendar.getInstance();//2.return GregorianCalendar
        //return current time
        c.set(2019, 0, 1);//0-Jan.
        //c.set(year, month, date, hourOfDay, minute, second);

        System.out.println(c);

        Date d=c.getTime();

        System.out.println(d);

        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));//24
        System.out.println(c.get(Calendar.HOUR));//12

        //Date <-> String,conversion
        //Date -> String format yyyy-MM-dd hh:mm:ss//小写m是分钟，小h是12小时，小s是毫秒数
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(d));

        //String->Date
        String str="2019-10-1 12:12:12";
        try{
            Date d2=sdf.parse(str);
            System.out.println(d2);
        }
        catch(ParseException e)
        {
            System.out.println("ParseException");
        }
    }
}