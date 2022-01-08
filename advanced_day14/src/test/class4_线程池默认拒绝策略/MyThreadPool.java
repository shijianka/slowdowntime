package test.class4_线程池默认拒绝策略;

import java.sql.Time;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThreadPool {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                2,5,2, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()//异常终止策略超出后直接报异常，丢弃超出的线程
        );
        for (int i = 0; i < 11; i++) {
            threadPoolExecutor.submit(()->{
                System.out.println(Thread.currentThread().getName()+"在执行");
            });

        }
        threadPoolExecutor.shutdown();
    }
}
