public class Exercise
{
    public static void main(String[] args) {
        String s="hello";
        int i=0;
        try {
            for(i=0;;i++) s.charAt(i);
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println(i);
        }
    }

}