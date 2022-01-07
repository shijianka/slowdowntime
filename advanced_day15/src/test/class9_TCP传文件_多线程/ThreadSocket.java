package test.class9_TCP传文件_多线程;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class ThreadSocket implements Runnable {
    private Socket acceptSocket;

    public ThreadSocket(Socket accept) {
        this.acceptSocket = accept;
    }


    @Override
    public void run() {
        BufferedOutputStream bufferedOutputStream = null;
        try {
            InputStream inputStream = acceptSocket.getInputStream();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            File file = new File("C:\\root\\Cloud\\OneDrive\\root\\workSpace\\IDEA\\study_itheima\\advanced_day15\\src\\test\\" + UUID.randomUUID().toString() + ".png");

            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            int b;
            System.out.println("【服务器】数据接收中...");
            while ((b = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(b);
            }
            System.out.println("【服务器】接受完毕。");
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(acceptSocket.getOutputStream()));
            bufferedWriter.write("上传成功");
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (acceptSocket != null) {
                try {
                    acceptSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
