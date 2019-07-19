import java.util.HashSet;
import java.util.Set;
public class TestObject
{
    public static void main(String[] args)
    {
        String a=new String("hello");
        String b=new String("hello");
        //????String???????new??????????????????
        String c="hello";
        String d="hello";

        System.out.println(a==b);//?????
        System.out.println(a.equals(b));//override

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        Object o1=new Object();
        Object o2=new Object();

        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());

        System.out.println(o1.toString());
        //java.lang.Object@???????

        //hashcode
        //?????????????§Ö???????¨´???????10??????
        //2????????????????--??????
        //???????????????????
        //???????????????????
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());

        //Create a Hashset
        //Set??List????
        //1.List??????????Set???????????
        //2.List??????Set????key?hashcode????¦Ë??
        Set<Student> set=new HashSet<>();//set????????,????????
        //?????????<>??????????????1.7??
        //Set set=new TreeSet();//?????????????

        Student s=new Student();
        s.setNo(1);
        s.setName("feiyy");
        s.setBirthday("1981-11-23");
        set.add(s);

        Student s2=new Student();
        s2.setNo(2);
        s2.setName("Jack");
        s2.setBirthday("1991-1-1");
        set.add(s2);

        set.add(s2);

        set.add(s);
        //????toString()??????set??§Õ(?????abstract collection??)
        System.out.println(set);
    }
}

class Student
{
    public int no;
    public String name;
    public String birthday;
    /**
     * @return the no
     */
    public int getNo() {
        return no;
    }
    /**
     * @return the birthday
     */
    public String getBirthday() {
        return birthday;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param birthday the birthday to set
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @param no the no to set
     */
    public void setNo(int no) {
        this.no = no;
    }
    @Override//??§Õ?????§Ò?????
    public boolean equals(Object obj) {

        //if(obj instanceof Student)
        Student s =(Student) obj;
        if(s.getNo()!=this.getNo()) return false;
        if(!s.getName().equals(this.getName())) return false;
        if(!s.getBirthday().equals(this.getBirthday())) return false;
        return true;
    }
    //?????????????
    @Override//Obj??hashcode???????????§Õ???????
    public int hashCode() {

        int h=0;
        h=h*31+this.name.hashCode();
        h=h*31+this.birthday.hashCode();
        h=h*31+this.no;

        return h;
    }
}