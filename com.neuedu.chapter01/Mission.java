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

        System.out.println("��������Ʒ���������ڣ���yyyy-MM-dd��");
        date=scanner.nextLine();
        System.out.println("�����뱣���ڣ��죩");
        day=scanner.nextLine();
        System.out.print("��������Ϊ��");
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
            System.out.println("����Ʒ�Ѿ�����");
        }
        else
        {
            long period=(productionCalendar.getTime().getTime()-calendar.getTime().getTime())/(24*60*60*1000);
            System.out.println("����"+period+"�����");
        }
        scanner.close();
    }
}