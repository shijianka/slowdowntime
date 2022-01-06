package test.class4;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author slowdowntime
 * @version 1.0
 * @description: TODO
 * @date 2021/12/31 15:58
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        //创建字符输出流对象
        FileWriter fileWriter = new FileWriter("advanced_day12\\src\\test\\class4\\No.1.txt");
//        一次写一个字符(fileWriter);
//        一次写一个字符数组(fileWriter);

//        在字符数组中指定索引处写入指定个数的字符(fileWriter);

//        一次写一个字符串(fileWriter);


        从字符串指定索引处写入指定个数的字符(fileWriter);

        fileWriter.close();

    }

    private static void 从字符串指定索引处写入指定个数的字符(FileWriter fileWriter) throws IOException {
        String test = "晚上吃啥呢？";
        fileWriter.write(test,2,3);
    }

    private static void 一次写一个字符串(FileWriter fileWriter) throws IOException {
        String test = "晚上吃啥呢？";
        fileWriter.write(test);
    }

    private static void 在字符数组中指定索引处写入指定个数的字符(FileWriter fileWriter) throws IOException {
        char[] chars = {97, 98, 99, 100, 101};
        fileWriter.write(chars,3,2);
    }

    private static void 一次写一个字符数组(FileWriter fileWriter) throws IOException {
        char[] chars = {97, 98, 99, 100, 101};
        fileWriter.write(chars);
    }

    private static void 一次写一个字符(FileWriter fileWriter) throws IOException {
        fileWriter.write(1);
        fileWriter.write(97);
        fileWriter.write(98);

    }
}
