package homework.third;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author slowdowntime
 * @version 1.0
 * @description: TODO
 * @date 2022/1/3 0:26
 */
public class third_test {
    /**
     * ## 题目三：
     *
     * 请按要求编写多线程应用程序，模拟多个人通过一个山洞：
     *
     * ​	1.这个山洞每次只能通过一个人，每个人通过山洞的时间为5秒；
     *
     * ​	2.随机生成10个人，同时准备过此山洞，并且定义一个变量用于记录通过隧道的人数。显示每次通过山洞人的姓名，和通过顺序；
     */
    public static void main(String[] args) {
        ArrayList<People> arrayList = new ArrayList<>();
        arrayList.add(new People("1号"));
        arrayList.add(new People("2号"));
        arrayList.add(new People("3号"));
        arrayList.add(new People("4号"));
        arrayList.add(new People("5号"));
        arrayList.add(new People("6号"));
        arrayList.add(new People("7号"));
        arrayList.add(new People("8号"));
        arrayList.add(new People("9号"));
        arrayList.add(new People("10号"));
        ArrayBlockingQueue<People> arrayBlockingQueue =  new ArrayBlockingQueue<>(1);
        In in = new In(arrayList,arrayBlockingQueue);
        Out out = new Out(arrayBlockingQueue);

        in.start();
        out.start();

    }
}
