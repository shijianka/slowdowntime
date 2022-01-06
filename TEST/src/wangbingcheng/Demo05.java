package wangbingcheng;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class Demo05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\root\\Cloud\\OneDrive\\root\\workSpace\\IDEA\\study_itheima\\advanced_day12\\src\\homework\\first.java"));
        char[] chars = new char[1024];
        int len = -1;
        while ((len = br.read(chars))!=-1){
            for (int i = 0; i < len; i++) {
                System.out.print(chars[i]);
            }
        }
    }
}
