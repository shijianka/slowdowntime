package test.testHashSet;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet();
        hashSet.add(new Student("张三",18) );
        hashSet.add(new Student("张三",19) );
        hashSet.add(new Student("张三",188) );
        hashSet.add(new Student("张三",18) );
        hashSet.add(new Student("张三",18) );
        hashSet.forEach( s -> System.out.println(s) );
    }
}
