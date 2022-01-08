package test.class1_线程池_Executors默认线程池;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPool {
    public static void main(String[] args) {
        /**
         *   static ExecutorService newCachedThreadPool() 创建一个默认的线程池对象，默认可以容纳的数量是int最大值
         */
        ExecutorService executorService = Executors.newCachedThreadPool();//静态方法，类名调用
        /**
         * Future<?>  submit(Runnable task) 提交一个可执行任务 并返回一个表示该任务的Future
         * <T>Future<T> submit(Callable<T> task) 提交任务执行，并返回代表待处理结果的Future
         */
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"-lambda表达式-在执行了...");
        });
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"-lambda表达式-在执行了...");
        });
        /*executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"-匿名内部类-在执行了");
            }
        });*/
       /* executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("Callable hello");
                return "hello";
            }
        });*/
        executorService.shutdown();

    }
}
