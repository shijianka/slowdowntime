package homework.first;

/**
 * @author slowdowntime
 * @version 1.0
 * @description: TODO
 * @date 2022/1/2 19:40
 */
public class first_Demo {
    /**
     * ## 题目一：
     * <p>
     * 编写程序，创建两个线程对象，一根线程循环输出“播放背景音乐”，另一根线程循环输出“显示画面”，
     * 要求线程实现Runnable接口，且使用匿名内部类实现
     */
    public static void main(String[] args) {
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("播放背景音乐...");
                }
            }
        };
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("显示画面...");
                }
            }
        };
        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);
        t1.start();

        t2.start();
    }
}
