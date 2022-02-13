package homework.双色球;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Enter类表示进入门内（阻塞队列）的动作
 */
public class Enter extends Thread {
    private ArrayBlockingQueue<Personnel> door;
    private ArrayList<Personnel> list;//门外员工们的集合
    private  boolean[] lock;//表示阻塞队列是否有元素

    public Enter(ArrayBlockingQueue<Personnel> door, ArrayList<Personnel> list, boolean[] lock) {
        this.door = door;
        this.list = list;
        this.lock = lock;
    }

    @Override
    public void run() {
        //声明待通过的员工对象
        Personnel personnel;
        //list表示门外的员工集合，若为空则推出循环
        while (true) {
            //若门内有人（阻塞队列里面的元素未被取出），则continue，再次判断会场外是否还有人（list是否为空）
            if(lock[0]){
             /*   try {
                    sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/

                continue;
            }
            //让门外的一个人进入门内
            synchronized (list) {
                if (list.size()>0){
                    personnel = list.get(list.size() - 1);
                    list.remove(personnel);
                }else{
                    break;
                }

            }
            try {
                //先将表示阻塞队列是否有元素的变量复制，让阻塞队列的take()进入等待状态
                lock[0]=true;
                //将员工放入阻塞队列
                door.put(personnel);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}
