package homework;

import java.io.File;

/**
 * @author slowdowntime
 * @version 1.0
 * @description: TODO
 * @date 2021/12/31 10:00
 */
public class third {
    public static void main(String[] args) {
//删除给定文件夹下所有大于2M的文件，如果文件夹下的子文件或者子文件夹被删除完毕了，也将该文件夹删除。
        File file = new File("C:\\root\\test");
        deleteDir2M(file);
    }

    private static void deleteDir2M(File file) {
        //文件路径无效则退出
        if (!file.exists()) {
            return;
        }
        //如果初始路径指向文件，则判断大小，大于2M删除并推出
        if (file.isFile()&&file.length()>1024*1024*2) {
            file.delete();
            return;
        }
        //如果是文件夹则如下操作
        if(file.isDirectory()){
            File[] files = file.listFiles();
            //如果是空文件夹则删除
            if(files.length==0){
                file.delete();
                return;
            }
            for (File f : files) {
                if(f.isFile()&&f.length()>1024*1024*2){
                    f.delete();
                }else if(f.isDirectory()){
                    deleteDir2M(f);
                    //删完子文件夹，判断文件夹是否为空
                    if (f.listFiles().length==0) {
                        f.delete();
                    }
                }

            }
        }
    }

}
