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
    static int num = 0;
    private boolean[] lock;

    public Pass(ArrayBlockingQueue<Personnel> door, boolean[] lock) {
        this.door = door;
        this.lock = lock;

    }

    @Override
    public String call() throws Exception {
        int passNum = 0;

        while (true) {

            Personnel take = null;
            try {
                synchronized (pass) {
                    if (num >= 100) {
                        break;
                    }
                    if (lock[0]) {

                        take = door.take();
                        num++;
                        lock[0]=false;

                    } else {
                        continue;
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            passNum++;
            System.out.println("编号为: " + take + " 的员工从 " + Thread.currentThread().getName() + "门入场! 拿到的双色球彩票号码是:" + Arrays.toString(lotteryTicket.getTicket()));
        }
        return "从" + Thread.currentThread().getName() + "门入场的员工总共: " + passNum + " 位员工";
    }
}
