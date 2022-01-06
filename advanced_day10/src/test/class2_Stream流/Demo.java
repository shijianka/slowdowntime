package test.class2_Stream流;

import java.util.ArrayList;
import java.util.List;

/**
 * @author slowdowntime
 * @version 1.0
 * @description: TODO
 * @date 2021/12/28 11:35
 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>(List.of("张三丰","张无忌","张翠山","王二狗","张三"));

        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list) {
            if(s.startsWith("张")){
                list2.add(s);
            }
        }
        for (String s : list2) {
            System.out.print(s+" ");
        }
        System.out.println();
        ArrayList<String> list3 = new ArrayList<>();
        for (String s : list2) {
            if(s.length()==3){
                list3.add(s);
            }
        }
        for (String s : list3) {
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println("=============================");
        list.stream().filter(s->s.startsWith("张"))
                .filter(s->s.length()==3)
                .forEach(s-> System.out.print(s+" "));
    }
}
