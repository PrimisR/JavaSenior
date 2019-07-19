import java.util.HashMap;
import java.util.Scanner;
public class Practice_02
{
    public static void main(String[] args) {
        HashMap<Character,Integer> map=new HashMap<>();
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        for(char ch:str.toCharArray())
            map.put(ch,map.containsKey(ch)?map.get(ch)+1:1);
        System.out.println(map.entrySet());
        scanner.close();
    }
}