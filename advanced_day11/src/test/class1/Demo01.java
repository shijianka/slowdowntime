package test.class1;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author slowdowntime
 * @version 1.0
 * @description: TODO
 * @date 2021/12/30 9:53
 */
public class Demo01 {
    /*
    在当前模块下aa文件夹中创建一个a.txt文件
     */
    public static void main(String[] args) throws IOException {
//        createFileTest();
        File file = new File("advanced_day11\\aa");

        deleteDir(file);

    }

    private static void deleteDir(File file) {
        File[] files = file.listFiles();
        System.out.println(Arrays.toString(files));
        for (File file1 : files) {
            if(file1.isFile()){
                file1.delete();
            }else {
                deleteDir(file1);
            }
        }
        file.delete();
    }

    private static void createFileTest() throws IOException {
        File file = new File("advanced_day11\\aa");
        if(!file.exists()){
            file.mkdirs();
        }
        File newFile = new File(file,"a.txt");
        newFile.createNewFile();
    }
}
