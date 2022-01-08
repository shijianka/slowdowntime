package test.class3_线程池ThreadPoolExecutor;

public class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"在执行了");
    }
}
