package test.class4;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author slowdowntime
 * @version 1.0
 * @description: TODO
 * @date 2021/12/31 16:11
 */
public class Demo02 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("advanced_day12\\src\\test\\class4\\No.2.txt");
        fileWriter.write("别打扰我学习，不然我就和你一起打游戏");
        fileWriter.close();
    }
}
