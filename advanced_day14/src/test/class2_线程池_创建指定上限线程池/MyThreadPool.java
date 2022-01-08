package test.class2_线程池_创建指定上限线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPool {
    public static void main(String[] args) {
        /**
         * static newFixedThreadPool(int nThreads) 创建指定容量的线程池
         */
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"在执行了");
        });executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"在执行了");
        });executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"在执行了");
        });executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"在执行了");
        });
        executorService.shutdown();
    }
}
