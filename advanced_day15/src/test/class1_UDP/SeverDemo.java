package test.class1_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class SeverDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket  datagramSocket = new DatagramSocket(10000);
        byte[] bytes = new byte[1024];

        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length);
        datagramSocket.receive(datagramPacket);
        byte[] data = datagramPacket.getData();
        int length = datagramPacket.getLength();
        System.out.println(new String(data,0,length));
        datagramSocket.close();
    }
}
