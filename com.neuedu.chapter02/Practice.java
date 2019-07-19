import java.util.HashMap;
import java.util.Scanner;

public class Practice
{
    public static void main(String[] args) {
        HashMap<Integer,Account> accounts=new HashMap<>();
        accounts.put(1,new Account(1,"tom",80000));
        accounts.put(2,new Account(2,"jace",82340));
        accounts.put(3,new Account(3,"jerry",76890));

        Scanner sc=new Scanner(System.in);
        int userid=sc.nextInt();

        Account account=accounts.get(userid);
        System.out.println(account.getBalance());
        sc.close();
    }
}

class Account
{
    private int id;
    private String name;
    private double balance;
    public Account(int id,String name,double balance)
    {
        this.id=id;
        this.name=name;
        this.balance=balance;
    }
    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}