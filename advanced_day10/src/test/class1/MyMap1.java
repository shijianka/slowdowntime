package test.class1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author slowdowntime
 * @version 1.0
 * @description: TODO
 * @date 2021/12/28 9:57
 */
public class MyMap1 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",1);
        Student s2 = new Student("sili",2);
        Student s3 = new Student("wangwu",3);
        Map<String ,Integer> map = new HashMap<>();
        map.put(s1.getName(),s1.getAge());
        map.put(s2.getName(),s2.getAge());
        map.put(s3.getName(),s3.getAge());
        Set<String> strings = map.keySet();
        for (String string : strings) {
            System.out.print(string+", ");
            System.out.println(map.get(string));
        }
    }
}
