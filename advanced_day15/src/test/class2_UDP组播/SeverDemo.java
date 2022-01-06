package test.class2_UDP组播;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class SeverDemo {
    public static void main(String[] args) throws IOException {
        MulticastSocket multicastSocket = new MulticastSocket(10000);
        DatagramPacket datagramPacket = new DatagramPacket(new byte[1024],1024);
        //绑定组播地址
        multicastSocket.joinGroup(InetAddress.getByName("224.0.1.0"));
        multicastSocket.receive(datagramPacket);
        byte[] data = datagramPacket.getData();
        int length = datagramPacket.getLength();
        System.out.println(new String(data,0,length));
        multicastSocket.close();
    }

}
