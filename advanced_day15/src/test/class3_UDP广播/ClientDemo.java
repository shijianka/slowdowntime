package test.class3_UDP广播;

import java.io.IOException;
import java.net.*;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        InetAddress address = InetAddress.getByName("255.255.255.255");
        int port = 10000;
        String s="hello，广播";
        byte[] bytes = s.getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length,address,port);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }

}
