package test.class6_TCP传文件;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SeverDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10011);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        File file = new File("C:\\root\\Cloud\\OneDrive\\root\\workSpace\\IDEA\\study_itheima\\advanced_day15\\src\\test\\img.png");
//        File file = new File("src/test/class6_TCP传文件/q1.png");

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        int b;
        System.out.println("我执行了吗");
        while ((b=bufferedInputStream.read())!=-1){
            System.out.println("我执行了吗2");
//            System.out.print((char) b);
            bufferedOutputStream.write(b);
        }
        System.out.println("我执行了吗3");

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bufferedWriter.write("上传成功");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        accept.close();
        bufferedOutputStream.close();
        serverSocket.close();


    }
}
