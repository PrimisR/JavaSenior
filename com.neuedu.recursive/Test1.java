public class Test1
{
    public static void main(String[] args) {
        //print(100);
        //System.out.println(sum(100));
        System.out.println(reverse("abcdefg"));
    }

    public static void print(int n)
    {
        System.out.println(n);
        if(n==1) return;
        print(n-1);
    }

    public static int sum(int n)
    {
        if(n==1) return 1;
        return sum(n-1)+n;
    }

/*    public static int Fibonacci(int index)
    {
        
    }
*/
    public static String reverse(String s)
    {
        if(s.length()==1) return s;
        return reverse(s.substring(1))+s.substring(0,1);
    }
}