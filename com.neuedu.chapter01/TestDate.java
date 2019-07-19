import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.*;

public class TestDate
{
    public static void main(String[] args) {
        //1.��ȡ��ǰϵͳʱ��
        Date now=new Date();
        System.out.println(now);

        long time=now.getTime();//1970.1.1 00:00:00 GMT+0

        Date now2=new Date();
        System.out.println(now.equals(now2));
        System.out.println(now.compareTo(now2));//now��now2ǰ,-1

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
        //Date -> String format yyyy-MM-dd hh:mm:ss//Сдm�Ƿ��ӣ�Сh��12Сʱ��Сs�Ǻ�����
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