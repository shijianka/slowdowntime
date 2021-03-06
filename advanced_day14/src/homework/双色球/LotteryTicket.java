package homework.双色球;

import java.util.Arrays;
import java.util.Random;

/**
 * LotteryTicket类中有获得表示双色球彩票号码的数组，此数组已经按照相应的规则排序
 */
public class LotteryTicket {
    public int[] getTicket() {
        Random random = new Random();
        int[] ticket = new int[6];
        loop:
        for (int i = 0; i < 6; i++) {
            int num;
            if (i == 5) {//第六位号码 1~16
              num = random.nextInt(16) + 1;
                for (int temp : ticket) {
                    if (temp == num) {
                        i--;
                        continue loop;
                    }
                }
            } else {
             num = random.nextInt(33) + 1;//前五位号码1~33
                for (int temp : ticket) {//若是重复则continue loop；
                    if (temp == num) {
                        i--;
                        continue loop;
                    }
                }
            }
            ticket[i] = num;
        }
        Arrays.sort(ticket,0,5);//将前五位升序排列
        return ticket;
    }

}
