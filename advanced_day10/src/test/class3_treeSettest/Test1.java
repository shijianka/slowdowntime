package test.class3_treeSettest;

import java.util.TreeMap;

public class Test1 {
    public static void main(String[] args) {
        TreeMap<Student,String> treeMap = new TreeMap<>();
        Student s1 = new Student("xiaohei",20);
        Student s2 = new Student("dabai",13);
        Student s3 = new Student("ahanhan",13);

        treeMap.put(s1,"北京");
        treeMap.put(s2,"西安");
        treeMap.put(s3,"上海");

        treeMap.forEach(
                (Student student,String s)->{
                    System.out.println(student+"---"+s);
                }
        );

    }
}