package example.jdk8date;

import java.time.LocalDateTime;

/**
 * JDK8 时间类添加或者减去时间的方法
 */
public class JDK8DateDemo6 {
    public static void main(String[] args) {
        //public LocalDateTime plusYears (long years)   添加或者减去年

        LocalDateTime localDateTime = LocalDateTime.of(2020, 11, 11, 13, 14, 15);
        //LocalDateTime newLocalDateTime = localDateTime.plusYears(1);
        //System.out.println(newLocalDateTime);

        LocalDateTime newLocalDateTime = localDateTime.plusYears(-1);
        System.out.println(newLocalDateTime);


    }
}
