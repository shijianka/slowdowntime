package test.class1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author slowdowntime
 * @version 1.0
 * @description: TODO
 * @date 2021/12/28 20:46
 */
public class MyMap2 {
    public static void main(String[] args) {
        Student s1 = new Student("shi", 11);
        Student s2 = new Student("jian", 12);
        Student s3 = new Student("ka", 13);

        HashMap<Student, String> hashMap = new HashMap();
        hashMap.put(s1, "西安");
        hashMap.put(s2, "汉中");
        hashMap.put(s3, "咸阳");
        System.out.println("第一种遍历方式(keySet())：");
        Set<Student> students = hashMap.keySet();
        for (Student student : students) {
            System.out.println(student + "----" + hashMap.get(student));
        }

        System.out.println("第二种遍历方式(entrySet())：");
        Set<Map.Entry<Student, String>> entries = hashMap.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey() + "---" + entry.getValue());
        }

        System.out.println("第三种遍历方式：");
        hashMap.forEach((Student student, String s) -> {
            System.out.println(student + "---" + s);
        });


    }


}
