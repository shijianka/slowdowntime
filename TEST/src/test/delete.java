package test;

import cn.shijianka.file.DeleteFile;

import java.io.File;

public class delete {
    public static void main(String[] args) {

        DeleteFile deleteFile = new DeleteFile();
        String target ="C:\\root\\Cloud\\OneDrive\\root\\workSpace\\IDEA\\study_itheima\\TEST\\src\\test\\test";
        boolean b = deleteFile.deleteFolder(target);
        System.out.println("删除"+b);

        File file = new File("C:\\root\\Cloud\\OneDrive\\root\\workSpace\\IDEA\\study_itheima\\TEST\\src\\test\\test");
        int count = 1;
        while (count++<10){
            if(file.exists()){
                file = new File(file+"\\test"+count);
                boolean mkdirs = file.mkdirs();
                System.out.println("第"+count+mkdirs);
            }else {
                file.mkdirs();
            }
        }
    }
}
