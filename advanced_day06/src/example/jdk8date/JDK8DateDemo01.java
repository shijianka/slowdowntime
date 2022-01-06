package example.jdk8date;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author zhaosong
 * @version 1.0
 * @description
 * @date 2021/12/23 14:19
 */
public class JDK8DateDemo01 {
    /**
     * 需求：有一个日期字符串 2000年11月11日 12:00:00，给该字符串日期增加1天，并打印？
     */
    public static void main(String[] args) throws ParseException {
        String strDate = "2000年11月11日 12:00:00";

        //1、通过DateTimeFormatter.ofPattern设置日期字符串格式
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        //2、把日期字符串转为时间对象
        LocalDateTime ldt = LocalDateTime.parse(strDate, dtf);
        //3、给时间对象增加1天，返回一个新的时间对象
        /*LocalDateTime ldt1 = ldt.plusDays(1).plusYears(2);
        LocalDateTime ldt2 = ldt.plusYears(2);
        LocalDateTime ldt3 = ldt.plusMonths(-2);*/

        /*LocalDateTime ldt1 = ldt.minusYears(1);
        LocalDateTime ldt2 = ldt.minusMonths(2);*/

        LocalDateTime ldt1 = ldt.withYear(111).withMonth(12).withDayOfMonth(13);

        //4、新的时间对象转换为时间字符串
        String format1 = ldt1.format(dtf);
        System.out.println(format1);


        //获取当前系统时间
       /* LocalDateTime now = LocalDateTime.now();
        //获取指定时间
        LocalDateTime of = LocalDateTime.of(2000, 10, 11, 12, 13, 14);

        LocalDate ld = of.toLocalDate();
        System.out.println(ld);
        LocalTime lt = of.toLocalTime();
        System.out.println(lt);*/




        /*int year = of.getYear();//年
        System.out.println(year);
        int monthValue = of.getMonthValue();//月
        System.out.println(monthValue);
        int dayOfMonth = of.getDayOfMonth();//当月第几天
        System.out.println(dayOfMonth);
        int dayOfYear = of.getDayOfYear();//当年第几天
        System.out.println(dayOfYear);
        DayOfWeek dayOfWeek = of.getDayOfWeek();//第几周
        System.out.println(dayOfWeek);
        int minute = of.getMinute();//分钟
        System.out.println(minute);
        int hour = of.getHour();//小时
        System.out.println(hour);
        int second = of.getSecond();//秒
        System.out.println(second);*/


      /*  //1、把该日期字符串转为Date对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date1 = sdf.parse(strDate);
        //2、Date获取当前时间的毫秒值
        long time = date1.getTime();
        //3、给该毫秒值+1天的毫秒值（24*60*60*1000）
        time += 24*60*60*1000;
        //4、把增加后的时间毫秒值，转为Date对象
        Date date2 = new Date(time);
        //5、把该Date对象转为日期字符串，并打印
        String format = sdf.format(date2);
        System.out.println(format);*/
    }


}
