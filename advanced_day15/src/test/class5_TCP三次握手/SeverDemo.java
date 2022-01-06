package test.class5_TCP三次握手;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SeverDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10001);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
//        int b;
       /* while ((b = inputStream.read()) != -1) {
            System.out.print((char) b);
        }*/
        while ((line = bufferedReader.readLine()) != null) {
            System.out.print(line);
        }
        accept.shutdownInput();


        OutputStream outputStream = accept.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));

        bufferedWriter.write("你谁啊？");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        accept.shutdownOutput();


        outputStream.close();
        inputStream.close();
        accept.close();
        serverSocket.close();


    }
}
