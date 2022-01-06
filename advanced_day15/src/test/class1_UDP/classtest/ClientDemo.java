package test.class1_UDP.classtest;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class ClientDemo {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        boolean flag =true;
        DatagramSocket datagramSocket = new DatagramSocket();
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 10000;
        while (flag){
            System.out.println("请输入：");
            String  s = scanner.nextLine();
            flag=s.equals("886")?false:true;

            byte[] bytes =s.getBytes();
            DatagramPacket datagramPacket = new DatagramPacket(bytes,0,bytes.length,address,port);
            datagramSocket.send(datagramPacket);
        }
        datagramSocket.close();
    }
}
