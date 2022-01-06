package test.class1_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建套接字
        DatagramSocket datagramSocket = new DatagramSocket();
        //打包
        String s ="hello UDP!";
        byte[] bytes = s.getBytes();
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 10000;

        DatagramPacket datagramPacket=new DatagramPacket(bytes,bytes.length,address,port);

        datagramSocket.send(datagramPacket);

        //释放资源
        datagramSocket.close();

    }
}
