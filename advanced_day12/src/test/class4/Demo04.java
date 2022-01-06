package test.class4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author slowdowntime
 * @version 1.0
 * @description: TODO
 * @date 2021/12/31 17:01
 */
public class Demo04 {
    /**
     * 一次读取多个字符
     */
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\root\\Cloud\\OneDrive\\root\\workSpace\\IDEA\\study_itheima\\advanced_day12\\src\\test\\class4\\No3.txt");
        char [] chars = new char[1024];
        int len;

        while((len=fileReader.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }
        fileReader.close();
    }
}
