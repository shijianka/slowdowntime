package example.mycollectiondemo1;

import java.util.ArrayList;
import java.util.Iterator;

public class MyCollectonDemo5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");

        Iterator<String> it1 = list.iterator();
        while (it1.hasNext()){
            String ss = it1.next();
            if ("b".equals(ss)){
                //因为迭代器在进行遍历的时候，list集合的值不允许被修改
                list.remove(ss);
            }
        }





        /*Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            if("b".equals(s)){
                //指向谁,那么此时就删除谁.
                it.remove();
                //报错ConcurrentModificationException，迭代过程当中对集合内容进行修改时就会报该异常
                //list.remove(s);
            }
        }
        System.out.println(list);*/
    }
}
