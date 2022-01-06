package zhangzhenhua.day16_网络编程;



import java.io.*;
import java.net.Socket;

public class ClientDemo4 {

    public static void main(String[] args) throws IOException {
        //创建客户端对象
        Socket socket =new Socket("127.0.0.1",21212);
        //创建本地流读取本地文件
        BufferedInputStream bis =new BufferedInputStream(new FileInputStream("C:\\root\\Cloud\\OneDrive\\root\\workSpace\\IDEA\\study_itheima\\advanced_day15\\src\\test\\class6_TCP传文件\\SeverDemo.java"));
        //写到服务器--网络中的流
        OutputStream os = socket.getOutputStream();
        BufferedOutputStream bos =new BufferedOutputStream(os);
        int b;
        while((b= bis.read())!=-1){
            bos.write((char)b);//通过网络写到服务器中
        }
        //需要告诉服务器给出结束标记
        socket.shutdownOutput();

        //接收反馈创建字符输入流
        InputStreamReader reader =new InputStreamReader(socket.getInputStream());
        BufferedReader br =new BufferedReader(reader);

        String line;
        while((line= br.readLine())!=null){
            System.out.println(line);
        }

        //关流
        bis.close();
        socket.close();

    }
}
