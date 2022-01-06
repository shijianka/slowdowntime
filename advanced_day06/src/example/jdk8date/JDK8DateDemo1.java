package example.jdk8date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * 需求：给一个日期字符串2020年11月11日 00:00:00 增加一天
 */
public class JDK8DateDemo1 {
    public static void main(String[] args) throws ParseException {
        //JDKMethod();
        String s = "2020年11月11日 00:00:00";
        //1、指定时间格式化类型
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        //2、把日期字符串转为LocalDateTime对象，同时设置对应格式化类型，必须和日期字符串格式保持一直，否则解析报错
        LocalDateTime localDateTime = LocalDateTime.parse(s, pattern);
        LocalDateTime newLocalDateTime = localDateTime.plusDays(1);
        //3、把LocalDateTime对象转为格式化类型的字符串
        String result = newLocalDateTime.format(pattern);
        System.out.println(result);
    }

    private static void JDKMethod() throws ParseException {
        String s = "2020年11月11日 00:00:00";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = sdf.parse(s);
        long time = date.getTime();
        time = time + (1000 * 60 * 60 * 24);
        Date newDate = new Date(time);
        String result = sdf.format(newDate);
        System.out.println(result);
    }
}
