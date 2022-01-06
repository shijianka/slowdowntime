package test.class1_UDP.classtest;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class SeverDemo {
    public static void main(String[] args) throws IOException {
        boolean flag=true;
        DatagramSocket datagramSocket =new DatagramSocket(10000);
        while (flag){
            byte[] bytes = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length);
            datagramSocket.receive(datagramPacket);
            byte[] data = datagramPacket.getData();
            int length = datagramPacket.getLength();
            String s = new String(data, 0, length);
            System.out.println(s);
            if(s.equals("886")){
                return;
            }
        }
    }
}
