package 第22题;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class UploadSever {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(10435);

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                3,//核心线程数量
                10,//线程池的容量
                60, //临时线程的空闲时间
                TimeUnit.SECONDS,//临时线程空闲时间的单位
                new ArrayBlockingQueue<>(5),//阻塞队列--允许有多少个线程等待
                Executors.defaultThreadFactory(),//创建线程的方式
                new ThreadPoolExecutor.AbortPolicy()//任务拒绝策略
        );

        while (true) {
            Socket socket = serverSocket.accept();
            ThreadSocket threadSocket = new ThreadSocket(socket);
            threadPoolExecutor.submit(threadSocket);
        }
    }
}
