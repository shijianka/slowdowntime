package test.class3_日期工具类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class second {
    public static void main(String[] args) throws ParseException {
        String strDate = "2000年11月11日 12:00:00";
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date1 = sdf.parse(strDate);
        long time = date1.getTime();
        time+=24*60*60*1000;
        Date date2 = new Date(time);
        String format = sdf.format(date2);
        System.out.println(format);

    }
}
