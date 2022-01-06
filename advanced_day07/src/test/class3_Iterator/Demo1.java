package test.class3_Iterator;

import java.util.ArrayList;

import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");
        Iterator<String> iterator = list.iterator();


            while (iterator.hasNext()){
                String s =  iterator.next();
                if("b".equals(s)){
                    iterator.remove();
                }
            }

        System.out.println(list);
    }


}
