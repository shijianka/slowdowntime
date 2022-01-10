package homework.练习题;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class FindTxt {
    /**
     * 1.打印指定目录下所有的txt文件的名称(不打印文件夹路径)
     * 2.获取指定目录(包含子目录)下所有的txt文件的个数,并打印文件名称
     * 3.定义工具类，编写方法：
     * public static ArrayList<String> getAllFileNames2List(File srcDir,String fileType)
     * 参数File srcDir:源文本文件
     * 参数String fileType:文件类型(比如：.doc,.txt,.java)
     * 方法要求：将srcDir文件夹(包含子文件)所有扩展名为fileType的文件名称存入ArrayList<String>集合并返回
     * 4.测试方法
     */
    public static void main(String[] args) {
        File file = new File("C:\\root\\Cloud\\OneDrive\\root\\workSpace\\IDEA\\study_itheima\\advanced_day13");
        String type = "java";
        ArrayList<String> allFileNames2List = getAllFileNames2List(file, type);
        System.out.println(allFileNames2List.size()+"个"+type+"文件");
        for (String s : allFileNames2List) {
            System.out.println(s+", ");
        }
    }

    public static ArrayList<String> getAllFileNames2List(File srcDir, String fileType) {
        //获取指定目录下所有的文件
        ArrayList<String> result = new ArrayList<>();

        File[] files = srcDir.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                String[] splits = file.getName().split("\\.");
                if (splits.length > 0 && splits[splits.length - 1].equals(fileType)) {
                    result.add(file.getName());
                }
            }else {
                ArrayList<String> allFileNames2List = getAllFileNames2List(new File(srcDir + "\\" + file.getName()), fileType);
                result.addAll(allFileNames2List);
            }
        }
        return result;
    }

}
