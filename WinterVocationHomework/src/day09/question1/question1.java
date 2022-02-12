package day09.question1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class question1 {
    public static void main(String[] args) {
        HashMap<String, Set<String>> hashMap = new HashMap<>();
        Set<String> pinPai = new HashSet<>();
        pinPai.add("电子工业出版社");
        pinPai.add("异步图书");
        pinPai.add("清华大学出版社");
        hashMap.put("品牌",pinPai);

        Set<String> date = new HashSet<>();
        date.add("往季");
        date.add("2019年春季");
        date.add("2019年冬季");
        hashMap.put("上市时间",date);

        Set<String> computerAndNet = new HashSet<>();
        computerAndNet.add("编程语言与程序设计");
        computerAndNet.add("网络通讯");
        computerAndNet.add("数据库");
        hashMap.put("计算机与互联网",computerAndNet);

        hashMap.forEach((key,value)->{
            System.out.print(key+":");
            value.forEach((value1)->{
                System.out.print(value1+"  ");
            });
            System.out.println();
        });

    }
}
