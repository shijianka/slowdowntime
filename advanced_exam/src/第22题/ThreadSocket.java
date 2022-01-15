package 第22题;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class ThreadSocket implements Runnable {

 private Socket socket;
    public ThreadSocket(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        BufferedOutputStream bufferedOutputStream=null;
        try {
            InputStream inputStream = socket.getInputStream();
            BufferedInputStream bufferedInputStream=new BufferedInputStream(inputStream);

            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File("C:\\root\\Cloud\\OneDrive\\root\\workSpace\\IDEA\\study_itheima\\advanced_exam\\src\\第22题\\服务器文件夹\\"+ UUID.randomUUID().toString()+".png" )));
            int bytes;
            System.out.println("【服务器】文件接收中...");
            while ( (bytes=bufferedInputStream.read())!=-1 ){
                bufferedOutputStream.write(bytes);
            }
            System.out.println("【服务器】文件接收完毕");

            //发送反馈
            OutputStream outputStream = socket.getOutputStream();
            BufferedOutputStream bufferedOutputStream1 = new BufferedOutputStream(outputStream);
            bufferedOutputStream1.write("【服务器的反馈】文件上传成功".getBytes());
            bufferedOutputStream1.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //释放资源

            try {
                if (bufferedOutputStream!=null) {
                    bufferedOutputStream.close();
                }
                socket.shutdownInput();
                //释放资源
                socket.shutdownOutput();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
