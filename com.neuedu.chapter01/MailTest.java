import java.util.Scanner;

public class MailTest
{
    public static boolean testMail(String email) {
        return email.matches("^\\w+@\\w+\\.\\w+$");
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String email=scanner.next();
        if(testMail(email)) System.out.println("Valid.");
        else 
        {   
            System.out.println("Invalid.");
            int countat=0;
            int countdot=0;
            for(int i=0;i<email.length();i++)
            {
                if(email.charAt(i)=='@') countat++;
                if(email.charAt(i)=='.') countdot++;
            }
            if(email.matches("[^\\w]*?"))//!!!
                System.out.println("Illegal Letter");
            if(!(email.contains("@")&&email.contains(".")))
                System.out.println("No @ or .");
            else
            {
                if(countat>1||countdot>1)
                    System.out.println("More than one @ or .");
                if(email.substring(0, email.indexOf('@')).length()>email.substring(0, email.indexOf('.')).length())
                    System.out.println(". is before @.");//split
            }
        }
        if(testMail(email))
        {
            System.out.println("UserName:"+email.substring(0,email.indexOf('@')));
            System.out.println("Local:"+email.substring(email.indexOf('@'),email.length()));
        }
        scanner.close();
    }
}