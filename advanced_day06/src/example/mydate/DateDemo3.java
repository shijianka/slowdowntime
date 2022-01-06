package example.mydate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo3 {
    public static void main(String[] args) {
        //当前时间的Date对象
        Date date = new Date();

        //创建了一个日期格式。
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy哈哈MM月dd日 HH:mm:ss");

        String result1 = sdf.format(date);
        System.out.println(result1);
    }
}
