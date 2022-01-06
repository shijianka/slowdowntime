package homework.third;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class In {
    ArrayList<People> people;
    ArrayBlockingQueue<People> arrayBlockingQueue;
    public In(ArrayList<People> people,ArrayBlockingQueue<People> arrayBlockingQueue){
        this.people = people;
        this.arrayBlockingQueue = arrayBlockingQueue;
    }

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            try {
                for(int  i = 0 ; i<10;i++) {
                    arrayBlockingQueue.put(people.get(i));

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
