package test.class2;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author slowdowntime
 * @version 1.0
 * @description: TODO
 * @date 2021/12/30 10:29
 */
public class Demo02 {
    public static void main(String[] args) {
        File file = new File("advanced_day11");
        Map<String , Integer> map = new  HashMap<>();
        getCount(map,file);
        System.out.println(map);
        /*Set<String> strings = map.keySet();
        for (String string : strings) {
            System.out.print(string+",");
            System.out.println(map.get(string));
        }*/
/*
java,3
png,1
iml,1
文件夹,5

 */
    }

    private static void getCount(Map<String,Integer> map, File file) {
        String wuHouZhui = "无后缀";
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isFile()){
                String name = file1.getName();
                String[] split = name.split("\\.");
                if(split.length==1){
                    if(map.containsKey(wuHouZhui)){
                        Integer integer = map.get(wuHouZhui);
                        map.put(wuHouZhui,++integer);
                    }else {
                        map.put(wuHouZhui,1);
                    }
                }else {
                    if (split.length>1) {
                        if(map.containsKey(split[split.length-1])){
                            Integer integer = map.get(split[split.length-1]);
                            map.put(split[split.length-1],++integer);
                        }else {
                            map.put(split[split.length-1],1);
                        }
                    }
                }
            }else if(file1.isDirectory()) {
                if(map.containsKey("文件夹")){
                    Integer 文件夹 = map.get("文件夹");
                    文件夹++;
                    map.put("文件夹",文件夹);
                }else {
                    map.put("文件夹",1);
                }
                getCount(map,file1);

            }
        }
    }
}
