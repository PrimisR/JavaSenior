public class Practice
{
    public static void main(String[] args) {
        String email="feiyy@neusoft.com";
        System.out.println(email.matches("^[a-zA-Z0-9_]+@\\w+(\\.[a-zA-Z]+){1,2}$"));
    }
}