package test.class2_泛型;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 不写泛型的弊端
 */
public class GenericitySummarize {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            String  next = (String)iterator.next();

            System.out.println(next);
        }
    }
}
