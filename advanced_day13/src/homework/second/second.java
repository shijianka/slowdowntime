package homework.second;

/**
 * @author slowdowntime
 * @version 1.0
 * @description: TODO
 * @date 2022/1/3 0:18
 */
public class second {
    /**
     * ## 题目二：
     *
     * 编写一个Java程序，要求在同一个类中除main线程外，再开启一个线程，2个线程都循环执行20次。
     */

    public static void main(String[] args) {
        for (int j = 0; j<20;j++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    int i = 0;
                    while (i<20){
                        System.out.println("我执行了"+(i+++1)+"次");
                    }
                }
            };
            Thread t1 = new Thread(runnable);
            t1.start();
        }
    }
}
