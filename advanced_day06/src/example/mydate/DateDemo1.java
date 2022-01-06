package example.mydate;

import java.util.Date;

/**
 * @author zhaosong
 * @version 1.0
 * @description
 * @date 2021/12/19 12:42
 */
public class DateDemo1 {

    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1);

        Date date2 = new Date(1000);
        System.out.println(date2);
    }

}
