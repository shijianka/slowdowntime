package test.class3_日期工具类;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class third {
    public static void main(String[] args) {
        String strDate = "2000年11月11日 12:00:00";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(strDate, dtf);
        LocalDateTime localDateTime1 = localDateTime.plusDays(1);

        String format1 = localDateTime1.format(dtf);
        System.out.println(format1);

        LocalDateTime now = LocalDateTime.now();

        LocalDateTime of = LocalDateTime.of(2000, 11, 11, 11, 11, 11, 11);
    }


}
