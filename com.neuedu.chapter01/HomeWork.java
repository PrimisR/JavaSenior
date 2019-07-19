import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Calendar;
import java.util.regex.*;
public class HomeWork
{
    private static Scanner scanner=new Scanner(System.in);

    private static void HomeWork1()
    {
        String a1;
        String a2;
        Integer sum;
        a1=scanner.next();
        a2=scanner.next();
        sum=Integer.parseInt(a1)+Integer.parseInt(a2);
        System.out.println(sum);
    }

    private static void HomeWork2()
    {
        String str;
        int e=0;
        str=scanner.next();
        for(int i=0;i<str.length();i++)
            if(str.charAt(i)=='e')
                e++;
        System.out.println(e);
    }

    private static void HomeWork3()
    {
        Random random=new Random();
        int[] numbers=new int[10];
        for(int i=0;i<10;i++)   
            numbers[i]=random.nextInt(101);
        Arrays.sort(numbers);//数组排序
        for(int i=0;i<10;i++)
            System.out.println(numbers[i]);
    }

    private static void HomeWork2_1()
    {
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.HOUR, -7);
        System.out.println("Paris Time: "+calendar.getTime());
        calendar.add(Calendar.HOUR, -5);
        System.out.println("NewYork Time: "+calendar.getTime());  
    }

    private static void HomeWork2_3()
    {
        String str=scanner.next();
        String substr=scanner.next();
        int count=0;
        int start=0;
        int substrLength=substr.length();
        while(str.length()>=substrLength)
        {
            if((start=str.indexOf(substr))==-1) break;
            else
            {
                count++;
                str=str.substring(start+substrLength, str.length());
                //System.out.println(str);
            }
        }
        System.out.println(count);
    }

    private static void HomeWork2_3_1()
    {
        String str=scanner.next();
        String substr=scanner.next();
        String prevStr=str;
        int count=0;

        while(true)
        {
            str=str.replaceFirst(substr,"");
            if(!str.equals(prevStr))
            {
                count++;
                prevStr=str;
            }
            else break;
        }

        System.out.println(count);
    }

    private static void HomeWork2_4()
    {
        String test_1="中国China123";
        String test_2="4Hell5o你6好";
        String test_3="都是汉字";
        String test_4="123456";
        String test_5="abcdef";

        String test=test_1;//for test
        char ch;

        int totalChi=0;
        int totalNum=0;
        int totalEng=0;

        for(int i=0;i<test.length();i++)
        {
            ch=test.charAt(i);
            char[] arr={ch};
            String str=new String(arr);
            if(isInteger(str)) totalNum++;
            //Character.isDigit()
            else if(isChinese(ch)) totalChi++;
            else if(is_alpha(str)) totalEng++;
            //Character.isLetter()//所有字符
            else;
        }

        System.out.println("Total Number:"+totalNum);
        System.out.println("Total Letter:"+totalEng);
        System.out.println("Total Chinese:"+totalChi);
    }

    public static boolean isChinese(char ch)
    {
        //获取此字符的UniCodeBlock
        Character.UnicodeBlock ub = Character.UnicodeBlock.of(ch);
        //  GENERAL_PUNCTUATION 判断中文的“号  
        //  CJK_SYMBOLS_AND_PUNCTUATION 判断中文的。号  
        //  HALFWIDTH_AND_FULLWIDTH_FORMS 判断中文的，号 
        if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS 
            || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B 
            || ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS 
            || ub == Character.UnicodeBlock.GENERAL_PUNCTUATION) {
            //System.out.println(ch + " 是中文");
            return true;
        }
         return false;
    }

     /** 速度快
     * 判断是否为整数
     * @param str 传入字符串
     * @return 是整数返回true，否则返回false
     */
    public static boolean isInteger(String str){
        Pattern pattern=Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }
   /**
    * 判断是否是字母
    * @param str 传入字符串
    * @return 是字母返回true，否则返回false
    */
   public static boolean is_alpha(String str) {
       if(str==null) return false;
       return str.matches("[a-zA-Z]+");
   }


    private static void HomeWork2_5()
    {
        Integer number=scanner.nextInt();
        StringBuilder numStringBuilder=new StringBuilder();
        Integer digit;
        while(number!=0)
        {
            digit=number%10;
            numStringBuilder.append(digit.toString());
            number/=10;
        }
        
        String numString=numStringBuilder.toString();
        boolean fail=false;
        int length=numStringBuilder.length();
        for(int i=0;i<length/2;i++)
        {
            if(numString.charAt(i)!=numString.charAt(length-i-1))
            {//stringBuilder reverse
                fail=true;
                break;
            }
        }
        if(fail) System.out.println("This is not a huiwen number.");
        else System.out.println("Huiwen yes!");
    }

    public static void main(String[] args) {
        //HomeWork1();
        //HomeWork2();
        //HomeWork3();
        //HomeWork2_1();
        //HomeWork2_3();
        //HomeWork2_5();
        //HomeWork2_4();
        //HomeWork2_3_1();
        scanner.close();
    }
}