package example.mydate;

import java.util.Date;

/**
 * @author zhaosong
 * @version 1.0
 * @description
 * @date 2021/12/19 12:42
 */
public class DateDemo2 {

    public static void main(String[] args) {
        Date date1 = new Date();
        long time = date1.getTime();
        System.out.println(time);

        long time1 = System.currentTimeMillis();
        System.out.println(time1);

        Date date2 = new Date();
        date2.setTime(1000);
        System.out.println(date2);

    }

}
