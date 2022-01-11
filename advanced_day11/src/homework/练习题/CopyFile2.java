package homework.练习题;

import java.io.*;

public class CopyFile2 {
    public static void main(String[] args) {
        File file1 = new File("C:\\root\\Cloud\\OneDrive\\root\\workSpace\\IDEA\\study_itheima\\advanced_day11\\src\\test");
        File file2 = new File("C:\\root\\Cloud\\OneDrive\\root\\workSpace\\IDEA\\study_itheima\\advanced_day11\\src\\homework\\练习题");
        copy(file1, file2);
    }

    public static void copy(File file1, File file2) {
        if (!file1.exists()) {
            return;
        }
        if (file1.isFile()) {
            copyFile(file1, file2);
        }
        if (file1.isDirectory()) {
            String name = file1.getName();
            File newFile2 = new File(file2 + "\\" + name);
            if (!newFile2.exists()) {
                newFile2.mkdirs();
            }
            File[] files = file1.listFiles();
            for (File file : files) {
                copy(file, newFile2);
            }
        }
    }

    private static void copyFile(File file1, File file2) {
        try {
            file2=new File(file2+"\\"+file1.getName());
            if (!file2.exists()) {
                file2.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(file1);
            fileOutputStream = new FileOutputStream(file2);
            byte[] bytes = new byte[1024];
            int len = -1;
            while ((len = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
