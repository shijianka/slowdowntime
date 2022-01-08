package homework.双色球;

import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;

public class Pass extends Thread {
    LotteryTicket lotteryTicket = new LotteryTicket();
    ArrayBlockingQueue<Personnel> door;
    static int num = 0;

    public Pass(ArrayBlockingQueue<Personnel> door) {
        this.door = door;
    }

    @Override
    public void run() {
        int passNum = 0;
        while (num<100) {
            Personnel take = null;
            try {
                take = door.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            num++;
            passNum++;
            System.out.println("编号为: " + take + " 的员工从 " + getName() + "门入场! 拿到的双色球彩票号码是:" + Arrays.toString(lotteryTicket.getTicket()));

        }
        System.out.println("从后门入场的员工总共: "+passNum+" 位员工");
    }



}
