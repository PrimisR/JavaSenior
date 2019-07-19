public class PrintExercise
{
    public static void main(String[] args) {
        PrintUppercase pru=new PrintUppercase();
        PrintLowercase plu=new PrintLowercase();

        Thread pu=new Thread(pru);
        Thread lu=new Thread(plu);

        pu.start();
        lu.start();
    }
}

class PrintUppercase implements Runnable
{
    public static String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    @Override
    public void run() {
            for(int i=0;i<26;i++)
            {
                System.out.println(str.charAt(i)); 
                synchronized(PrintLowercase.str) {
                PrintLowercase.str.notify(); }
                synchronized(str) {
                try {
                    str.wait();
                } catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                }
            }
    }
}

class PrintLowercase implements Runnable
{
    public static String str="abcdefghijklmnopqrstuvwxyz";

    @Override
    public void run() {
            for(int i=0;i<26;i++)
            {
                System.out.print(str.charAt(i));
                synchronized(PrintUppercase.str) {
                PrintUppercase.str.notify(); }
                synchronized(str) {
                try {
                    str.wait();
                } catch(InterruptedException e)
                {
                    e.printStackTrace();
                } }
            }
    }
}