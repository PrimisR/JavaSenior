import java.util.Random;

public class TestMath
{
    public static void main(String[] args) {
        //1.1红球
        int[] redballs =new int[6];
        int index=0;
        Random random=new Random();
        int num1=random.nextInt(33);//0~32整数
        System.out.println(num1);
        while(index<6)
        {
            //1.生成1-33随机数//0~32+1(floor)
            int num=(int)Math.floor(Math.random()*33)+1;
            //2.判断是否存在
            if(!isExists(redballs, num))//不抽重
            {
                redballs[index++]=num;
            }
        }
        //1-16 1.2抽一个蓝球
        int bluenum=(int)Math.floor(Math.random()*16+1);
        //1.3打印
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