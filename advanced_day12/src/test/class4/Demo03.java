package test.class4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author slowdowntime
 * @version 1.0
 * @description: TODO
 * @date 2021/12/31 16:55
 */
public class Demo03 {
    /**
     * 一次读取一个字符
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\root\\Cloud\\OneDrive\\root\\workSpace\\IDEA\\study_itheima\\advanced_day12\\src\\test\\class4\\No3.txt");

        int ch;
        while ((ch=fileReader.read())!=-1){
            System.out.print((char)ch);
        }
        fileReader.close();
    }
}
