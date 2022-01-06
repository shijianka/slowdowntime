package test.class3;

import java.io.*;

/**
 * @author slowdowntime
 * @version 1.0
 * @description: TODO
 * @date 2021/12/31 14:27
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("advanced_day12\\src\\homework\\names.txt");
        String code = "utf-8";
        InputStreamReader reader = new InputStreamReader(in,code);
        char[] chs = new char[1024];
        int len = -1;
        while ((len = reader.read(chs))!=-1){
            for(int i = 0; i <len; i++){
                System.out.print(chs[i]);
            }
        }
        reader.close();
    }
}
