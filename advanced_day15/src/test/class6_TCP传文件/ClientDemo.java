package test.class6_TCP传文件;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",10011);

        //本地流
        File file = new File("C:\\root\\Cloud\\OneDrive\\root\\workSpace\\IDEA\\study_itheima\\advanced_day15\\src\\test\\class6_TCP传文件\\img.png");
//        File file = new File("src/test/class6_TCP传文件/q1.png");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        //网络流
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());

        int b;
        while ((b=bufferedInputStream.read())!=-1){
//            System.out.print((char) b);
            bufferedOutputStream.write(b);
        }
        bufferedOutputStream.flush();
        socket.shutdownOutput();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while ((line=bufferedReader.readLine())!=null){
            System.out.println(line);
        }
        socket.close();
        bufferedInputStream.close();

    }
}
