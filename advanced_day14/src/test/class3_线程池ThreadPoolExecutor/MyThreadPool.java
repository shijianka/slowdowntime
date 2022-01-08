package test.class3_线程池ThreadPoolExecutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThreadPool {
    public static void main(String[] args) {
        /**
         * 参数一 核心线程数量
         * 参数二 最大线程数量
         * 参数三 空闲线程最大存活时间
         * 参数四 时间单位
         * 参数五 任务队列
         * 参数六 创建线程工厂
         * 参数七 任务拒绝策略
         */
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                2,5,//核心线程和最大线程
                2, TimeUnit.SECONDS,//等待时间和单位
                new ArrayBlockingQueue<>(10),//阻塞队列容量
                Executors.defaultThreadFactory(),//默认创建线程方式
                new ThreadPoolExecutor.AbortPolicy()//拒绝策略
        );
        threadPoolExecutor.submit(new MyThread());
        threadPoolExecutor.submit(new MyThread());
        threadPoolExecutor.submit(new MyThread());
        threadPoolExecutor.submit(new MyThread());
        threadPoolExecutor.shutdown();

    }
}
