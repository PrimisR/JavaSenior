import java.util.Random;

public class TestMath
{
    public static void main(String[] args) {
        //1.1����
        int[] redballs =new int[6];
        int index=0;
        Random random=new Random();
        int num1=random.nextInt(33);//0~32����
        System.out.println(num1);
        while(index<6)
        {
            //1.����1-33�����//0~32+1(floor)
            int num=(int)Math.floor(Math.random()*33)+1;
            //2.�ж��Ƿ����
            if(!isExists(redballs, num))//������
            {
                redballs[index++]=num;
            }
        }
        //1-16 1.2��һ������
        int bluenum=(int)Math.floor(Math.random()*16+1);
        //1.3��ӡ
        for(int i=0;i<index;i++)
            System.out.print(redballs[i]+"\t");
        System.out.println();
        System.out.println(bluenum);
    }

    public static boolean isExists(int[] arr,int target)
    {
        for(int item:arr)
        {
            if(item==target)
                return true;
        }
        return false;
    }

    public static void lottory() {
        String[] names={"01","02","03","04","05","06","07","08","09","10"};
        int index=(int) Math.floor(Math.random()*10);
        System.out.println(names[index]);
    }
}