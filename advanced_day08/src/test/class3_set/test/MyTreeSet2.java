package test.class3_set.test;

import java.util.TreeSet;

/**
 * TreeSet集合存储Student类型
 */
public class MyTreeSet2 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();
        Student s1 = new Student("小花",11);
        Student s2 = new Student("小花花",12);
        Student s3 = new Student("小小花",13);
        Student s4 = new Student("小小花花",11);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        System.out.println(ts);
    }
}
