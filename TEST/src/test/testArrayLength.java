package test;

import java.io.File;

public class testArrayLength {
    public static void main(String[] args) {
        /*String[] arr = new String[0];
        System.out.println(arr);
        System.out.println(arr.length);*/
        File file = new File("C:\\root\\Cloud\\OneDrive\\root\\workSpace\\IDEA\\study_itheima\\advanced_day11\\src\\homework\\练习题\\testCopyFile\\src");
        de(file);
    }

    public static void de(File file) {
        /*if(file.isDirectory()){
            File[] files = file.listFiles();
            if(!(files.length==0)){
                for (File file1 : files) {
                    if(file1.isFile()){
                        file1.delete();
                    }else {
                        de(file1);
                    }
                }
            }else {
                file.delete();
            }
        }*/
        File[] files = file.listFiles();
//        System.out.println(files[0].getName()+"--"+files.length);

        if (file.isFile()) {
            file.delete();
        }

        for (int i = 0; i < files.length; i++) {

            if (files[i].isDirectory()) {
                File[] files1 = files[i].listFiles();
                if (files1.length != 0) {
                    de(files[i]);
                }
                if (files1.length==0) {
                    de(files[i]);
                }
            }

        }
    }
}
