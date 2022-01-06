package test.class2_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo01 {
    public static void main(String[] args) {
        Collection  collection= new ArrayList();
        collection.add("111");
        collection.add("112");
        collection.add("1122");
//        boolean b = collection.removeIf(
//                (String s) -> {
//                    return s.length() == 3;
//                }
//        );

        Iterator<String> iterator=collection.iterator();
        while (iterator.hasNext()){
        System.out.println(iterator.next());}

    }
}
