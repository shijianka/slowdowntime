package test.class2_UDP组播;

import java.io.IOException;
import java.net.*;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        String s ="hello 组播！";
        byte[] bytes = s.getBytes();
        InetAddress address = InetAddress.getByName("224.0.1.0");
        int port =10000;
        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length,address,port);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();


    }
}
