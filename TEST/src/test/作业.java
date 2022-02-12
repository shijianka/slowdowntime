package test;

import java.util.ArrayList;
import java.util.List;

public class 作业 {
    public static void main(String[] args) {
        List list  = new ArrayList();
        list.add("一号");
        list.add("二号");
        list.add("三号");
//        list.add(11);
        //遍历集合
        list.forEach(s->{
            String e = (String) s;
            System.out.println(e.length());
        });

    }
}
