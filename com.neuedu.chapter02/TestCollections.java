import java.util.ArrayList;
import java.util.List;

import java.util.Collections;

class Student implements Comparable<Student>
{
    private int age;
    private String name;
    private double score;

    /**
     * @return the score
     */
    public double getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(double score) {
        this.score = score;
    }
    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }
    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    public Student(int age,String name,double score)
    {
        this.age=age;
        this.name=name;
        this.score=score;
    }
    @Override
    public int compareTo(Student o) {
        if(this.score>o.score) return 1;
        else if(this.score<o.score) return -1;
        return 0;
    }
}

public class TestCollections
{
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.add(20);
        list1.add(60);
        list1.add(17);
        list1.add(33);

        //sort in ascending order
        Collections.sort(list1);
        //sort in descending order
        Collections.reverse(list1);//?

        System.out.println(Collections.binarySearch(list1, 60));

        for(Integer item:list1)
            System.out.println(item);

        List<String> list2=new ArrayList<>();
        list2.add("Tom");
        list2.add("Jack");

        List<Student> list3=new ArrayList<>();
        Student student1=new Student(12, "Tom", 11);
        Student student2=new Student(11,"Jack",15);
        Student student3=new Student(14,"Joe",12);
        list3.add(student1);
        list3.add(student2);
        list3.add(student3);

        Collections.sort(list3);
        for(Student stu:list3)
            System.out.println(stu.getName());
    }
}