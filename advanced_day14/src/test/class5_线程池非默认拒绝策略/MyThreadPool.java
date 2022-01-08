package test.class5_线程池非默认拒绝策略;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThreadPool {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                1,2,2, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(1),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardPolicy()//策略 超出后，丢弃超出的线程,不报异常
        );
        for (int i = 0; i < 5; i++) {
            int y=i;
            threadPoolExecutor.submit(()->{
                System.out.println(Thread.currentThread().getName()+"在执行"+y);
            });

        }
        threadPoolExecutor.shutdown();
    }
}
