package homework;

import java.io.File;

/**
 * @author slowdowntime
 * @version 1.0
 * @description: TODO
 * @date 2021/12/31 9:46
 */
public class second {
    public static void main(String[] args) {
        /**
         * 定义一个方法，将给定文件夹以及子文件夹的名称以指定格式打印到控制台，
         * 第一级前没有tab键的效果，
         * 第二级前有一个tab键的效果，
         * 第三级有两个tab键的效果。格式如下：
         * day01资料
         * 	-- 视频
         * 		-- 01.IO流概述.avi
         * 		-- 02.IO流分类.avi
         * 	-- 代码
         * 		-- file_demo
         * 			-- src
         * 				-- com
         * 					-- ithema
         * 	-- 笔记
         * 		File类及IO流.md
         */
        File file = new File("advanced_day11\\src");
        method(file, "");

    }

    public static void method(File file, String s) {
        if (file.isFile()) {
            return;
        }else {
            System.out.println(s+file.getName());
        }


        File[] files = file.listFiles();
        s+="  ";
        for (File f : files) {
            if (f.isFile()) {
                System.out.println(s+f.getName());
            }else {
                method(f,s);
            }
        }
    }

}
