package test.class1_线程.threaddemo01;

/**
 * @author slowdowntime
 * @version 1.0
 * @description: TODO
 * @date 2022/1/2 13:38
 */
public class MyThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("线程开启了"+i);
        }
    }

}
