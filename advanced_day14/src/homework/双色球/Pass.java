package homework.双色球;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;

/**
 * Pass类表示通过门（阻塞队列）的动作
 */
public class Pass implements Callable<String> {
    static Object pass = new Object();

    public Pass() {
    }

    LotteryTicket lotteryTicket = new LotteryTicket();
    ArrayBlockingQueue<Personnel> door;
    static int num = 0;//成功通过门的人数
    private boolean[] lock;//表示阻塞队列是否有元素

    public Pass(ArrayBlockingQueue<Personnel> door, boolean[] lock) {
        this.door = door;
        this.lock = lock;

    }

    @Override
    public String call() throws Exception {
        //表示当前线程下通过的人数
        int passNum = 0;
        while (true) {
            //声明通过的员工对象；
            Personnel take = null;
            try {
                synchronized (pass) {
                    //如果通过人数达到100就退出循环
                    if (num >= 100) {
                        break;
                    }
                    //如果阻塞队列中有(true)元素，则取出，如果没有就continue;
                    if (lock[0]) {

                        take = door.take();
                        //每通过一个员工就让通过的总人数自增一，并将表示阻塞队列是否有元素的变量赋值为false
                        num++;
                        lock[0]=false;
                    } else {
                        continue;
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //将表示本线程通过人数的变量自增
            passNum++;
            //按照需求打印输出
            System.out.println("编号为: " + take + " 的员工从 " + Thread.currentThread().getName() + "门入场! 拿到的双色球彩票号码是:" + Arrays.toString(lotteryTicket.getTicket()));
        }
        //返回最终的结果
        return "从" + Thread.currentThread().getName() + "门入场的员工总共: " + passNum + " 位员工";
    }
}
