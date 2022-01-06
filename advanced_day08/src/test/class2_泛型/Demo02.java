package test.class2_泛型;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Demo02 {
    public static void main(String[] args) {
        ArrayList<String> strings = addElement(new ArrayList<String>(), "a", "b", "c", "d");
        System.out.println(strings);
        ArrayList<Integer> list2 = addElement(new ArrayList<Integer>(), 1, 2, 3, 4);
        System.out.println(list2);


    }

    public static <T> ArrayList<T> addElement(ArrayList<T> list, T t1, T t2, T t3, T t4) {
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        return list;
    }
}
