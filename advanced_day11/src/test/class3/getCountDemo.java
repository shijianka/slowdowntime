package test.class3;

import java.io.File;
import java.util.HashMap;

public class getCountDemo {
    public static void main(String[] args) {
        //创建对象,获取路径
        File file =new File("advanced_day11");
        //创建集合
        HashMap<String,Integer> hm= new HashMap<>();
        //调用计算次数方法
        getCount(hm,file);
        System.out.println(hm);
    }
    /*
    {java=3, png=1, iml=1}
     */
    private static void getCount(HashMap<String, Integer> hm, File file) {
        //找到file文件夹
        System.out.println("1");
        File[] files = file.listFiles();
        //遍历数组,获取文件夹内每个对象
        for (File file1 : files) {
            //判断每个对象是否为文件
            if(file1.isFile()){
                //如果是文件,获取文件名
                String file1Name = file1.getName();
                //将文件名切割,返回数组
                String[] fileNameArr = file1Name.split("\\.");
                //判断数组长度是否为2
                if(fileNameArr.length==2){
                    //如果是2,获取文件名类型
                    String fileEndName = fileNameArr[1];
                    //判断该类型在集合中是否存在
                    if(hm.containsKey(fileEndName)){
                        //如果存在获取值
                        Integer count = hm.get(fileEndName);
                        count++;
                        //将已经出先的次数覆盖掉
                        hm.put(fileEndName,count);
                    }else{//如果不存在,直接存入集合
                        hm.put(fileEndName,1);
                    }
                }
            }else {
                //如果不是文件,需要进行递归
                getCount(hm, file1);
            }
        }
    }
}