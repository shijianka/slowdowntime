package homework.双色球;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class Enter extends Thread{
    private ArrayBlockingQueue<Personnel> door;
    private ArrayList<Personnel> list;
    public Enter(ArrayBlockingQueue<Personnel> door,  ArrayList<Personnel> list){
        this.door=door;
        this.list = list;
    }
    @Override
    public void run(){
        while(!list.isEmpty()){
            Personnel personnel;
            synchronized (list) {
                personnel = list.get(list.size()-1);
                list.remove(personnel);
            }
            try {
                door.put(personnel);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
