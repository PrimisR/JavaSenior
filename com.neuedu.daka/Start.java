import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
public class Start
{
    private static Company c;
    private static Scanner sc=new Scanner(System.in);

    public static void checkin()
    {
        //1.get user input of empid
        System.out.println("������Ա����ţ�");
        int empid=sc.nextInt();
        Employee e=c.getEmpoyeeById(empid);
        if(e==null)
        {
            System.out.println("Ա��������");
            return;
        }
        //2.get current date,extract yyyy-MM-dd
        Date now=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String key=sdf.format(now);
        Map<String,List<Daka>> map=c.getDakaInfo();
        if(map.containsKey(key))
        {
            //3.2
            List<Daka> list=map.get(key);
            boolean isFound=false;
            for(Daka item:list)
            {
                if(item.getE().getId()==e.getId())
                {
                    System.out.println("�����Ѿ�ǩ����");
                    break;
                }
            }
            //how to decide employee is already checkin
            if(!isFound)
            {
                //checkin
                Daka daka=new Daka();
                daka.setE(e);
                daka.setCheckin(now);

                list.add(daka);
            }
        }
        else
        {
            //3.1
            Daka daka=new Daka();
            daka.setE(e);
            daka.setCheckin(now);

            List<Daka> list=new ArrayList<>();
            list.add(daka);

            map.put(key,list);
            System.out.println("ǩ���ɹ�");
        }
        //3.check if today has daka info
            /*3.1.no daka info, create daka instance, 
            *create ArrayList, put daka  
            *3.2.loop for List<Daka>, check if empid already exists
            */
    }

    public static void checkout()
    {
        System.out.println("������Ա����ţ�");
        int empid=sc.nextInt();
        Employee e=c.getEmpoyeeById(empid);
        if(e==null)
        {
            System.out.println("Ա��������");
            return;
        }
        //1.�õ���ǰϵͳʱ��
        Date now=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String key=sdf.format(now);
        Map<String,List<Daka>> map=c.getDakaInfo();
        if(map.containsKey(key))
        {
            List<Daka> list=map.get(key);
            boolean isFound=true;
            for(Daka item:list)
            {
                if(item.getE().getId()==e.getId())
                {
                    isFound=true;
                    //�ҵ���ǩ��
                    if(item.getCheckout()==null)
                    {

                    }
                    else
                    {
                        System.out.println("�Ѿ�ǩ���������ܶ���ǩ��");
                    }
                    break;
                }
            }
            if(!isFound)
            {
                //����ǩ��
            }
        }
        else
        {
            System.out.println();
        }
        
    }

    public static void showinfo()
    { 
        Date now=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String key=sdf.format(now);

        Map<String,List<Daka>> map=c.getDakaInfo();
        if(map.containsKey(key))
        {
            List<Daka> list=map.get(key);
            for(Daka item:list)
            {
                System.out.println(item.getE().getId()+"\t"+item.getE()+"\t"+item.getCheckin()+"\t"+item.getCheckout());
            }
        }
    }
    public static void main(String[] args) {

        c=new Company();

        boolean flag=true;
        while(flag)
        {
            System.out.println("----Ա����ϵͳ----");
            System.out.println("���� 0--------�˳�");
            System.out.println("���� 1--------ǩ��");
            System.out.println("���� 2--------ǩ��");
            System.out.println("���� 3--------�鿴ǩ����Ϣ");

            try
            {
                int num=sc.nextInt();
                if(num<0||num>3)
                {
                    throw new InputMismatchException();
                }

                switch(num)
                {
                    case 0:
                        flag=false;
                        break;
                    case 1:
                        checkin();
                        break;
                    case 2:
                        checkout();
                        break;
                    case 3:
                        showinfo();
                        break;
                    default:


                }
            }
            catch(InputMismatchException e)
            {
                sc=new Scanner(System.in);
                System.out.println("������0-3�ı��");
            }
        }
    }
}