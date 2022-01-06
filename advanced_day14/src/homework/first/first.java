package homework.first;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 现有如下文件路径：
 * ArrayList<String> pathList = new ArrayList<>();
 * pathList.add("C:\\Users\\Think\\Desktop\\65期笔记\\课堂笔记\\day18课堂笔记.md");
 * pathList.add("C:\\Users\\Think\\Desktop\\65期笔记\\课堂笔记\\day17课堂笔记.md");
 * pathList.add("C:\\Users\\Think\\Desktop\\65期笔记\\课堂笔记\\day16课堂笔记.md");
 * pathList.add("C:\\Users\\Think\\Desktop\\65期笔记\\课堂笔记\\day15课堂笔记.md");
 * pathList.add("C:\\Users\\Think\\Desktop\\65期笔记\\课堂笔记\\day14课堂笔记.md");
 * <p>
 * pathList.add("C:\\root\\Cloud\\OneDrive\\root\\workSpace\\IDEA\\study_itheima\\advanced_day14\\src\\homework\\first\\testDocument\\ExceptionDemo1");
 * <p>
 * 使用多线程完成文件拷贝
 * <p>
 * 要求：
 * <p>
 * 1. 使用线程池实现
 * 2. 将文件拷贝到 `D:\\robin` 文件夹
 * 3. 每个线程拷贝一个文件
 * 4. 当所有文件拷贝完毕后输出文件拷贝完毕
 * 5. 使用双列集合记录文件拷贝信息（键用来存储文件名，值用来存储拷贝完成的时间串）
 */
public class first {
    static long start = 0;
    static long end = 0;
    public static long time(){
        if(start==0){
            start=System.currentTimeMillis();
        }else {
            end = System.currentTimeMillis();
            long result= end-start;
            start=0;
            return result;
        }
        return 0;
    }
    public static void main(String[] args) throws IOException {
        ArrayList<String> pathList = new ArrayList<>();
        HashMap<String,String> hashMap = new HashMap<>(5);
        pathList.add("C:\\root\\Cloud\\OneDrive\\root\\workSpace\\IDEA\\study_itheima\\advanced_day14\\src\\homework\\first\\testDocument\\ExceptionDemo1.txt");
        pathList.add("C:\\root\\Cloud\\OneDrive\\root\\workSpace\\IDEA\\study_itheima\\advanced_day14\\src\\homework\\first\\testDocument\\ExceptionDemo2.txt");
        pathList.add("C:\\root\\Cloud\\OneDrive\\root\\workSpace\\IDEA\\study_itheima\\advanced_day14\\src\\homework\\first\\testDocument\\ExceptionDemo3.txt");
        pathList.add("C:\\root\\Cloud\\OneDrive\\root\\workSpace\\IDEA\\study_itheima\\advanced_day14\\src\\homework\\first\\testDocument\\ExceptionDemo4.txt");
        pathList.add("C:\\root\\Cloud\\OneDrive\\root\\workSpace\\IDEA\\study_itheima\\advanced_day14\\src\\homework\\first\\testDocument\\ExceptionDemo5.txt");

        File targetFile = new File("C:\\root\\Cloud\\OneDrive\\root\\workSpace\\IDEA\\study_itheima\\advanced_day14\\src\\homework\\first\\target");

//        cashedThreadPool();
//        fixedThreadPool();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (String s : pathList) {
            File file = new File(s);
            String name,time;
            name=file.getName();
            time();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(targetFile+"\\"+name));

            executorService.submit(()->{
                String line = null;
                while (true){
                    try {
                        if (!((line=bufferedReader.readLine())!=null)) break;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        bufferedWriter.write(line);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }


            });

            time=""+ time();
            hashMap.put(name,time);
        }
        System.out.println("拷贝完毕");
        for (String s : hashMap.keySet()) {
            String s1 = hashMap.get(s);
            System.out.println(s+","+s1);
        }

        executorService.shutdown();

    }

    private static void cashedThreadPool() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName() + "在执行了");
        });
        executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName() + "在执行了");
        });
        executorService.shutdown();
    }

    private static void fixedThreadPool() {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"在执行了。。。");
        });
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"在执行了。。。");
        });
        executorService.shutdown();
    }

}
