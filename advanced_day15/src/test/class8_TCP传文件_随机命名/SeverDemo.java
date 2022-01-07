package test.class8_TCP传文件_随机命名;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class SeverDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10011);

        while (true) {
            Socket accept = serverSocket.accept();
            InputStream inputStream = accept.getInputStream();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            File file = new File("C:\\root\\Cloud\\OneDrive\\root\\workSpace\\IDEA\\study_itheima\\advanced_day15\\src\\test\\"+ UUID.randomUUID().toString() +".png");

            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            int b;
            System.out.println("【服务器】数据接收中...");
            while ((b=bufferedInputStream.read())!=-1){
                bufferedOutputStream.write(b);
            }
            System.out.println("【服务器】接受完毕。");
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
            bufferedWriter.write("上传成功");
            bufferedWriter.newLine();
            bufferedWriter.flush();
            accept.close();
            bufferedOutputStream.close();
        }
//        serverSocket.close();


    }
}
