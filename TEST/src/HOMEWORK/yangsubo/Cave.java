package HOMEWORK.yangsubo;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author ：suboYang
 * @description：TODO
 * @date ：2022/1/2 18:26
 */
public class Cave extends Thread {
    private ArrayBlockingQueue<String> bq;
    private static int count;
    private static final Object obj = new Object();

    public Cave(ArrayBlockingQueue<String> bq) {
        this.bq = bq;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                try {
                    if (count == 10) {
                        break;
                    } else {
                        String take = bq.take();
                        count++;
                        System.out.println(take + ",第" + count + "个经过山洞");
                        Thread.sleep(5000);
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
