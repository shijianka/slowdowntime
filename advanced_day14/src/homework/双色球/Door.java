package homework.双色球;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Door类表示门，含有表示门的阻塞队列  和  相应的表示阻塞队列状态的变量
 */
public class Door {
    //前门，一次允许一人通过
    ArrayBlockingQueue<Personnel> door1 = new ArrayBlockingQueue<>(1);
    //前门是否有人正在通过
    public static volatile boolean[] lock1 = {false};//默认false ，没有人正在通过

    ArrayBlockingQueue<Personnel> door2 = new ArrayBlockingQueue<>(1);
    public static volatile boolean[] lock2 = {false};

}
