package test.class5_TCP三次握手;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",10001);
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));

       bufferedWriter.write("hello");
       bufferedWriter.flush();
//       outputStream.write("hello".getBytes());
        socket.shutdownOutput();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while ((line=bufferedReader.readLine())!=null){
            System.out.print(line);
        }

        socket.shutdownInput();
        inputStream.close();
        outputStream.close();
        socket.close();

    }
}
