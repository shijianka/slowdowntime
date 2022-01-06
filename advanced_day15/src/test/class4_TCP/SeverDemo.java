package test.class4_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SeverDemo  {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10001);
        System.out.println("test1");
        Socket accept = serverSocket.accept();
        System.out.println("test2");
        InputStream inputStream = accept.getInputStream();
        int b ;
        while ((b=inputStream.read())!=-1){
            System.out.print((char) b);
        }
        inputStream.close();
        serverSocket.close();
    }
}
