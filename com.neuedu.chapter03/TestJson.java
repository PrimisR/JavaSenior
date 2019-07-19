import com.alibaba.fastjson.JSON;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
//import java.io.InputStream;
import java.io.BufferedReader;
import java.io.File;
//import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestJson
{
    public static void main(String[] args) {
        //JSON(数据格式) 三种数据类型：数字，字符串(双引号定界)，boolean(true,false)
        //1.对象{"id":1,"name":"Jack"}
        //2.集合[{"id":1,"name":"Jack"},{"id":2,"name":"Tom"}]

        //难点：List<Student> <-> Json字符串 jar包(阿里巴巴 fastjson，Google gson)
        Student s=new Student();
        s.setId(1);
        s.setName("Jack");

        Student s1=new Student();
        s1.setId(2);
        s1.setName("Tom");

        System.out.println(JSON.toJSONString(s));

        String str="{\"id\":2,\"name\":\"Tom\"}";//\"转义

        Student s2=JSON.parseObject(str,Student.class);//s.getClass()

        System.out.println(s2.getId()+s2.getName());

        Map<String,Map<String,Integer>> m=new HashMap<>();
        Map<String,Integer> m1=new HashMap<>();
        Map<String,Integer> m2=new HashMap<>();
        Map<String,Integer> m3=new HashMap<>();
        m1.put("TOMTOM",1);
        m2.put("JACKJACK", 2);
        m3.put("JESSEJESSE",3);
        m.put("TOM", m1);
        m.put("JACK",m2);
        m.put("JESSE", m3);

        System.out.println(JSON.toJSONString(m));
        //parseArray
        List<Integer> list=JSON.parseArray("[1,2,3]",Integer.class);
        System.out.println(list);
        //List也算Array

        //InputStream in=TestJson.class.getClassLoader().getResourceAsStream("emps.data");
        //System.out.println(in);
        //相对于src路径

        List<Student> stus=new ArrayList<>();
        List<Student> stusback;
        stus.add(s);
        stus.add(s1);
        String jsonstr=JSON.toJSONString(stus);
        System.out.println(jsonstr);

        //File f=new File("stus.txt");
        //project bin目录下
        String str3;
        File f=new File(str3=(TestJson.class.getClassLoader().getResource("emps.txt").getPath()));
        System.out.println(str3);
        try (
            FileWriter w=new FileWriter(f);
            FileReader r=new FileReader(f);
            BufferedReader br=new BufferedReader(r);
        )
        {
            w.write(jsonstr);
            //json str->List<Student>
            w.flush();
            String str2=br.readLine();
            System.out.println(str2);
            stusback=JSON.parseArray(str2,Student.class);
            System.out.println(stusback);
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}