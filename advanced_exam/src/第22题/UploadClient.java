package 第22题;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class UploadClient {
    public static void main(String[] args) throws IOException {


        //创建套接字对象
        Socket socket = new Socket("127.0.0.1", 10435);
        //创建网络输出流
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        //获取需要上传的图片路径
        Scanner scanner = new Scanner(System.in);
        File file = null;
        while (true) {
            System.out.println("请输入上传文件的路径：");
            String sIn = scanner.next();
            file = new File(sIn);
            if (file.exists() && file.isFile()) {
                break;
            } else {
                System.out.println("请输入正确的图片文件路径，请重新输入");
            }
        }


        //创建本地输入流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        //本地输入流与网络输出流协作
        int bytes;
        System.out.println("【客户端】文件上传中...");
        while ( (bytes = bufferedInputStream.read() ) != -1 ) {
            bufferedOutputStream.write(bytes);
        }
        bufferedOutputStream.flush();
        System.out.println("【客户端】文件上传完毕");
        //释放资源
        bufferedInputStream.close();
        socket.shutdownOutput();

        //接受反馈
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream) );
        String line;
        while( (line=bufferedReader.readLine())!=null ){
            System.out.println(line);
        }
        //释放资源
        socket.shutdownInput();

    }
}