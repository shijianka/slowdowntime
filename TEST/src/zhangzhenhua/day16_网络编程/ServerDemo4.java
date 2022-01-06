package zhangzhenhua.day16_网络编程;



import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class ServerDemo4 {
    public static void main(String[] args) throws IOException {
        //创建服务器对象
        ServerSocket socket =new ServerSocket(21212);
        //创建线程池,节省资源
        ThreadPoolExecutor pool =new ThreadPoolExecutor(
                3,//核心线程数
                6,//线程池线程总数量
                60, //临时线程空闲时间
                TimeUnit.SECONDS, //时间单位
                new ArrayBlockingQueue<>(5), //阻塞队列
                Executors.defaultThreadFactory(),//创建线程默认方式
                new ThreadPoolExecutor.AbortPolicy()//拒绝策略
                );
        //监听
        while (true) {
            //等待客户端连接
            Socket accept = socket.accept();
            //创建对象
            TreadSocketDemo tsd =new TreadSocketDemo(accept);
            pool.submit(new Thread(tsd));

        }
    }
}
