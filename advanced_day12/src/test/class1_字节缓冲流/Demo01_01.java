package test.class1_字节缓冲流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author slowdowntime
 * @version 1.0
 * @description: TODO
 * @date 2021/12/31 10:55
 */
public class Demo01_01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("advanced_day11\\src\\test\\class3\\img.png");
        FileOutputStream fileOutputStream = new FileOutputStream("advanced_day12\\src\\test\\class1_字节缓冲流\\copy02.png");
        int b;
        while ((b=fileInputStream.read())!=-1){
            fileOutputStream.write(b);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
