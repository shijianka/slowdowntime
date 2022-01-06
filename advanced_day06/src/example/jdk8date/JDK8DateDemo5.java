package example.jdk8date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JDK8DateDemo5 {
    public static void main(String[] args) {
        //method1();
        //method2();
    }
    //2、解析日期字符串
    private static void method2() {
        //public static LocalDateTime parse (准备解析的字符串, 解析格式) 把一个日期字符串解析成为一个LocalDateTime对象
        String s = "2020年11月12日 13:14:15";
        //注意:定义一个和日期字符串相同格式的DateTimeFormatter对象，否则解析报错
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        LocalDateTime parse = LocalDateTime.parse(s, pattern);
        System.out.println(parse);
    }
    //1、将LocalDateTime时间对象，转为指定格式字符串
    private static void method1() {
        LocalDateTime localDateTime = LocalDateTime.of(2020, 11, 12, 13, 14, 15);
        System.out.println(localDateTime);
        //public String format (指定格式)   把一个LocalDateTime格式化成为一个字符串
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        String s = localDateTime.format(pattern);
        System.out.println(s);
    }
}
