package 自习;

import java.util.ArrayList;
import java.util.List;

public class Demo  {
    public static void main(String[] args) {
        Student student1 = new Student("1号",21);
        Student student2 = new Student("2号",22);
        Student student3 = new Student("3号",23);
        Student student4 = new Student("4号",24);
        Student student5 = new Student("5号",25);
        Student student6 = new Student("6号",27);

        List<Student> list = new ArrayList<>(6);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);



    list.sort((Student o1,Student o2)->{
        return o2.getAge()-o1.getAge();
    });

    list.forEach(System.out::println);
        long count = list.stream().filter(student -> student.getAge() > 5).count();
        System.out.println(count);
    }


}
