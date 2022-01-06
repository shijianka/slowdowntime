package homework.third;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class Out {
    ArrayList<People> outPeople = new ArrayList<>();
    ArrayBlockingQueue<People> arrayBlockingQueue;

    public Out(ArrayBlockingQueue<People> arrayBlockingQueue) {
        this.arrayBlockingQueue = arrayBlockingQueue;
    }

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            try {
                while (true) {
                    People take = arrayBlockingQueue.take();
                    for (int i=0;i<5;i++) {
                        System.out.println(take+"正在通过山洞...("+(5-i)+"s)");
                        Thread.currentThread().sleep(1000);
                    }
                    System.out.println(take+ "成功通过山洞！");
                    outPeople.add(take);
                    System.out.println("已经通过的人数是:" + outPeople.size());
                    System.out.print("已经通过的人的先后顺序是：");
                    for (People outPerson : outPeople) {
                        System.out.print(outPerson + " ");
                    }
                    System.out.println(" ");
                    if (outPeople.size() == 10) {
                        System.exit(0);
                    }
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    };

    public void start() {
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
