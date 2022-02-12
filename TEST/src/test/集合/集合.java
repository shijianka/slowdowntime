package test.集合;

import java.util.ArrayList;
import java.util.Iterator;

public class 集合 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("01");
        arrayList.add("02");
        arrayList.add("03");
        arrayList.add("04");
        arrayList.add("05");
        arrayList.add("06");
        Iterator<String> iterator = arrayList.iterator();

        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

    }
}
