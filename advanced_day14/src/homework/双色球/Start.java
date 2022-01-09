package homework.双色球;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
/**
 * 这是测试类
 *      1 创建了含有100位员工的单列集合 员工编号属性是1~100
 *      2 创建相应线程对象，启动线程
 *      3 从 FutureTask对象 中拿到返回值并打印结果
 */
public class Start {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建员工集合
        ArrayList<Personnel> listPersonnel = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            listPersonnel.add(new Personnel(i + ""));
        }
        Door d = new Door();
        Enter enter1 = new Enter(d.door1, listPersonnel, Door.lock1);
        Pass pass1 = new Pass(d.door1, Door.lock1);
        Enter enter2 = new Enter(d.door2, listPersonnel, Door.lock2);
        Pass pass2 = new Pass(d.door2, Door.lock2);

        FutureTask future1 = new FutureTask(pass1);
        FutureTask future2 = new FutureTask(pass2);

        Thread thread1 = new Thread(future1);
        Thread thread2 = new Thread(future2);

        thread1.setName("前");
        enter1.setName("前");
        thread2.setName("后");
        enter2.setName("后");
        thread1.start();
        enter1.start();
        thread2.start();
        enter2.start();


        System.out.println(future1.get());
        System.out.println(future2.get());


    }
}
