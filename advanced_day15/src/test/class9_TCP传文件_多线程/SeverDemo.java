package test.class9_TCP传文件_多线程;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class SeverDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10011);

        while (true) {
            Socket accept = serverSocket.accept();
            ThreadSocket threadSocket = new ThreadSocket(accept);
            new Thread(threadSocket).start();
        }
//        serverSocket.close();


    }
}
