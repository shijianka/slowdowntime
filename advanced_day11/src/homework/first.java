package homework;

import java.io.File;

public class first {
    public static void main(String[] args) {
        File file = new File("advanced_day11");
        long dirctoryLength = getDirctoryLength(file);
        System.out.println(dirctoryLength);
    }

    public static long getDirctoryLength(File file) {
        /*
            定义一个方法，用来获取指定文件夹的大小。方法声明如下：
        提示： File类中的length方法只能获取文件的大小。而文件夹的大小是文件夹下所有文件的总大小。
         */

        if(!file.exists()&&file.isDirectory()){
            return 0;
        }
        long result = 0;
        File[] files = file.listFiles();
        if ( files.length != 0) {
            for (File file1 : files) {
                if (file1.isFile()) {
                    result += file1.length();
                } else {
                    if (file1.listFiles().length != 0) {
                        result += getDirctoryLength(file1);
                    }
                }
            }
        }
        return result;
    }
}
