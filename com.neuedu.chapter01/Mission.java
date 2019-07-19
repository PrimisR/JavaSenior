import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;
public class Mission
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar=Calendar.getInstance();
        Date today=calendar.getTime();

        Date productionDate=new Date();
        int shelfLife;
        String date;
        String day;

        System.out.println("请输入商品的生产日期：（yyyy-MM-dd）");
        date=scanner.nextLine();
        System.out.println("请输入保质期（天）");
        day=scanner.nextLine();
        System.out.print("今天日期为：");
        System.out.println(sdf.format(today));
        
        try {
            productionDate=sdf.parse(date);
        }
        catch(ParseException e) {
            System.out.println("Wrong Format.");
        }
        
        shelfLife=Integer.parseInt(day);

        Calendar productionCalendar=Calendar.getInstance();
        productionCalendar.setTime(productionDate);
        //System.out.println(sdf.format(productionCalendar.getTime()));
        productionCalendar.add(Calendar.DAY_OF_YEAR, shelfLife);
        //System.out.println(sdf.format(productionCalendar.getTime()));
        if(productionCalendar.before(calendar))
        {
            System.out.println("该商品已经过期");
        }
        else
        {
            long period=(productionCalendar.getTime().getTime()-calendar.getTime().getTime())/(24*60*60*1000);
            System.out.println("还有"+period+"天过期");
        }
        scanner.close();
    }
}