package homework.双色球;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Enter类表示进入门内（阻塞队列）的动作
 */
public class Enter extends Thread {
    private ArrayBlockingQueue<Personnel> door;
    private ArrayList<Personnel> list;
    private boolean[] lock;

    public Enter(ArrayBlockingQueue<Personnel> door, ArrayList<Personnel> list, boolean[] lock) {
        this.door = door;
        this.list = list;
        this.lock = lock;
    }

    @Override
    public void run() {
        Personnel personnel;
        while (!list.isEmpty()) {
            if(lock[0]){
                try {

                    sleep(1);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                continue;
            }
            synchronized (list) {
                personnel = list.get(list.size() - 1);
                list.remove(personnel);
            }
            try {
                lock[0]=true;
                door.put(personnel);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
