package test.class3_set.test;

import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 */
public class MyTreeSet4 {
    public static void main(String[] args) {
        TreeSet<Teacher> ts = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                int result = o1.getAge()-o2.getAge();
                result=result==0?o1.getName().compareTo(o2.getName()):result;
                return result;
            }
        });
        Teacher t1 = new Teacher("zhangsan",22);
        Teacher t2 = new Teacher("lisi",23);
        Teacher t3 = new Teacher("wangwu",25);
        ts.add(t1);
        ts.add(t2);
        ts.add(t3);
        System.out.println(ts);
    }
}
