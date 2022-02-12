package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
       /* for (int i = 0; i < list.size(); i++) {
            System.out.println(list.remove(i));
            i--;
        }*/
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals("2")) {
                list.remove(next);
            }
        }
        list.forEach(s -> System.out.println(s));

    }

}
