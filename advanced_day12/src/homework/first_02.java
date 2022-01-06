package homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * @author slowdowntime
 * @version 1.0
 * @description: TODO
 * @date 2021/12/31 12:20
 */
public class first_02 {
    /**
     * 需求：（点名器）
     * 1.已经在某个磁盘存在一个文件，并且该文件中存储了很多人的名字，每个名字独占一行，例如：
     * F:\names.txt中内容如下：
     * 柳岩
     * 西施
     * 王昭君
     * 貂蝉
     * 杨玉环
     * 2.请编写一个程序，每次运行，都可以在控制台随机的输出一个文件中的名字
     */
    public static void main(String[] args) throws IOException {
        File file = new File("advanced_day12\\src\\homework\\names.txt");
        printName(file);
    }

    private static void printName(File file) throws IOException {
        if (!file.exists() || file.isDirectory()) {
            System.out.println("没找到花名册");
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] byteArr = new byte[(int)(file.length())];
        int len;
        String strResult = "";
        while ((len = fileInputStream.read(byteArr)) != -1) {
            strResult = new String(byteArr, "UTF-8");
        }
        fileInputStream.close();
        String[] split = strResult.split("\r\n");
        System.out.println(split[Math.abs(new Random().nextInt() % split.length)]);

    }
}
