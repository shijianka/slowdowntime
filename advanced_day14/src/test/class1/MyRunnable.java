package test.class1;

import java.util.concurrent.Semaphore;

public class MyRunnable {
    //获得管理员对象
    private Semaphore semaphore = new Semaphore(2);
   /* @Override
    public void run(){
        //获得通行证
        try {
            semaphore.acquire();
            //开始形式
            System.out.println("获得了通行证开始行驶");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }*/
}
