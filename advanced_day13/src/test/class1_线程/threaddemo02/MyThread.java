package test.class1_线程.threaddemo02;

/**
 * @author slowdowntime
 * @version 1.0
 * @description: TODO
 * @date 2022/1/2 15:08
 */
public class MyThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("第二种实现方式启动线程"+i);
        }
    }
}
