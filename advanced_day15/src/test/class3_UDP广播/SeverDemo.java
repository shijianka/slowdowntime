package test.class3_UDP广播;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class SeverDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(10000);
        DatagramPacket datagramPacket =new DatagramPacket(new byte[1024],1024);
        datagramSocket.receive(datagramPacket);
        byte[] data = datagramPacket.getData();
        int length = datagramPacket.getLength();
        System.out.println(new String(data,0,length));
    }
}
