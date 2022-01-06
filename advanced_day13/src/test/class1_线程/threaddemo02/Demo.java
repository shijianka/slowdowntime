package test.class1_线程.threaddemo02;

/**
 * @author slowdowntime
 * @version 1.0
 * @description: TODO
 * @date 2022/1/2 15:11
 */
public class Demo {
    public static void main(String[] args) {
        //创建了一个参数的对象
        MyThread myThread = new MyThread();
        MyThread myThread2 = new MyThread();
        //创建了一个线程对象
        Thread t1 = new Thread(myThread);
        Thread t2 = new Thread(myThread2);
        t1.start();
        t2.start();

    }
}
