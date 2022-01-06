package HOMEWORK.yangsubo;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;

/**
 * @author ：suboYang
 * @description：TODO
 * @date ：2022/1/2 18:24
 * 请按要求编写多线程应用程序，模拟多个人通过一个山洞：
 * <p>
 * ​	1.这个山洞每次只能通过一个人，每个人通过山洞的时间为5秒；
 * <p>
 * ​	2.随机生成10个人，同时准备过此山洞，并且定义一个变量用于记录通过隧道的人数。显示每次通过山洞人的姓名，和通过顺序；
 */
public class Demo {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
        ArrayList<String> names = new ArrayList<>();
        names.add("嫦娥");
        names.add("西施");
        names.add("王昭君");
        names.add("李白");
        names.add("赵云");
        names.add("诸葛亮");
        names.add("刘备");
        names.add("项羽");
        names.add("孙尚香");
        names.add("程咬金");

        while (names.size() != 0) {
            int num = new Random().nextInt(names.size());
            bq.put(names.get(num));
            new Cave(bq).start();
            names.remove(num);
        }
    }
}
