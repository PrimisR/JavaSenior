import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;//Map�ǽӿڣ�Entry���ڲ��ӿ�(Map$Entry.class)ΪMap������
import java.util.Set;

public class TestMap
{
    public static void main(String[] args) {
        Map<String,String> m=new HashMap<>();
        m.put("key", "value");
        m.put("key1", "value1");
        m.put("key", "value2");//keyֵ�ظ���value�ᱻ�滻
        //��������
        m.put("abc","abcd");
        m.put("abd","abcd");
        m.put("abe","abcde");

        System.out.println(m);

        System.out.println(m.get("abc"));

        m.remove("abd");
        System.out.println(m);

        //����map
        //1.
        //1)get all keys
        //2)loop for keys,get value for each key
        Set<String> keys=m.keySet();
        String value;
        for(String key:keys)
        {
            value=m.get(key);
            System.out.println(key+"\t"+value);
        }
        //2.(<K,V>--Entry<K,V>)
        //get key-value conbination
        Set<Entry<String, String>> entries=m.entrySet();//�鿴����������д
        for(Entry<String,String> entry:entries)
            System.out.println(entry);
    }
}