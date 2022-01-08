package homework.双色球;

import java.util.Random;

public class LotteryTicket {
    public int[] getTicket(){
        Random random = new Random();
        int[] ticket = new int[6];
        loop:for (int i = 0; i < 6; i++) {

            int num = random.nextInt(33) + 1;
            for (int temp : ticket) {
                if(temp==num){
                    i--;
                    continue loop;
                }
            }
            ticket[i]=num;
        }
        return ticket;
    }

}
