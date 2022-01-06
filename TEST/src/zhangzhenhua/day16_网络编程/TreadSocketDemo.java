package zhangzhenhua.day16_网络编程;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class TreadSocketDemo implements Runnable {
    private Socket accept;

    public TreadSocketDemo(Socket accept) {
        this.accept = accept;
    }

    @Override
    public void run() {
        BufferedWriter bufferedWriter = null;
        try {
            //创建网络接收流,从客户端读取数据
//                BufferedInputStream bis =new BufferedInputStream(accept.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
            //创建本地的流,把数据存到本地文件中
//                bos =new BufferedOutputStream(new FileOutputStream("C:\\root\\Cloud\\OneDrive\\root\\workSpace\\IDEA\\study_itheima\\advanced_day15\\src\\test\\"+ UUID.randomUUID().toString()+".java"));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\root\\Cloud\\OneDrive\\root\\workSpace\\IDEA\\study_itheima\\advanced_day15\\src\\test\\" + UUID.randomUUID().toString() + ".png")));
            //将数据写入本地文件永久保存
//                int b;
            String lines;
            while ((lines = bufferedReader.readLine()) != null) {
                bufferedWriter.write(lines);
            }
            bufferedWriter.flush();
            //创建字符输出流
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
            bw.write("上传成功");
            bw.newLine();
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (accept != null) {
                try {
                    accept.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //socket.close();
        }
    }
}

