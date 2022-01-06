package homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args){
        System.out.println("请输入字符串：");
        Scanner scanner = new Scanner(System.in);
        String strIn = scanner.next();
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0 ; i < strIn.length();i++){
            if(!list.contains(strIn.charAt(i))){
                list.add(strIn.charAt(i));
            }
        }
        for(char c : list){
            System.out.print(c);
        }
        System.out.println();
        Collection<String> collection = new ArrayList<>();
        collection.add("qqq");
        collection.add("2qq");
        collection.add("3qq");
        collection.add("3qqq");

        collection.removeIf(
                (String s)->{
                    return s.length()==3;
                }
        );
        System.out.println(collection);
    }
}
