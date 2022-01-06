package test.class1_线程.threaddemo03;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author slowdowntime
 * @version 1.0
 * @description: TODO
 * @date 2022/1/2 15:17
 */
public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable myCallable = new MyCallable();
        FutureTask<String> ft= new FutureTask(myCallable);
        Thread t1 = new Thread(ft);
        t1.start();

       String s= ft.get();
        System.out.println(s);

    }
}
