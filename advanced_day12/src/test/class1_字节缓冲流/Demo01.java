package test.class1_字节缓冲流;

import java.io.*;

/**
 * @author slowdowntime
 * @version 1.0
 * @description: TODO
 * @date 2021/12/31 10:47
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("advanced_day11\\src\\test\\class3\\img.png"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("advanced_day12\\src\\test\\class1_字节缓冲流\\copy.png"));
        int b;
        while ((b = bufferedInputStream.read()) != -1) {
            bufferedOutputStream.write(b);
        }
        bufferedOutputStream.close();
        bufferedInputStream.close();
    }
}
