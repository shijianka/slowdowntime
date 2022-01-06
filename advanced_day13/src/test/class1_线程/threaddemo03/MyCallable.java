package test.class1_线程.threaddemo03;

import java.util.concurrent.Callable;

/**
 * @author slowdowntime
 * @version 1.0
 * @description: TODO
 * @date 2022/1/2 15:16
 */
public class MyCallable implements Callable<String>{
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println("这是我的第三个多线程实现方式"+i);
        }
        return "完毕";
    }
}
