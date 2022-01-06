package homework.fourth;

import java.io.*;
import java.util.ArrayList;

public class fourth {
    /**
     * WolvesLeader就业老师:
     * 1.我们的系统需要把100万的用户信息输出到控制台中，
     * 数据格式为 用户名  密码  手机号
     * 例如 quincy 123456 14659206656
     * 要求导入时间不能太久，负责会影响系统对外提供服务，最好在1分钟内导入完成 (实现思路：多线程/队列/流 都行)
     * <p>
     * <p>
     * 把这个可以写完，这个对应开发中就是数据导入，导出很常见的功能
     */
    //1：随机生成含有一百万个用户信息的测试文件
    //2:创建用户类
    //3：将读取的用户信息存储在集合中
    //4：输出到控制台
    public static void main(String[] args) throws IOException {
//        bufferedWriterTest();
//        fileWriterTest();
//        bufferedReaderTest();

        //100万用户的集合
        ArrayList<User> arrayList = new ArrayList<>();
        //读取用户信息，并返回耗时
        long a= bufferedReaderTest(arrayList);
        //打印到控制台
        for (User user : arrayList) {
            System.out.println(user);
        }
        //将导入耗时打印展示
        System.out.println("导入耗时"+a+"ms");

    }

    private static void bufferedWriterTest() throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\root\\Cloud\\OneDrive\\root\\workSpace\\IDEA\\study_itheima\\advanced_day13\\src\\homework\\fourth\\userdata.txt"));
        TestTime.test();
        for (int i = 1; i <= 1000000; i++) {
            bufferedWriter.write( "名字" + i + "," + "密码" + i + "," + "电话" + i + "\r\n");
        }

        TestTime.test();//耗时为837ms,耗时为898ms,耗时为1028ms,耗时为1026ms,耗时为793ms
        System.out.println("(生成用户信息)");
        System.out.println("=====================");
        bufferedWriter.close();
    }

    private static void fileWriterTest() throws IOException {
        FileWriter fileWriter = new FileWriter("C:\\root\\Cloud\\OneDrive\\root\\workSpace\\IDEA\\study_itheima\\advanced_day13\\src\\homework\\fourth\\userdata.txt",false);
        TestTime.test();
        for (int i = 0; i < 1000000; i++) {
            fileWriter.write( "名字" + i + "," + "密码" + i + "," + "电话" + i + "\r\n");
        }
        TestTime.test();//耗时为1565ms,耗时为1035ms,耗时为1374ms,耗时为1195ms,耗时为1397ms
        fileWriter.close();
    }

    private static long bufferedReaderTest( ArrayList<User> arrayList) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\root\\Cloud\\OneDrive\\root\\workSpace\\IDEA\\study_itheima\\advanced_day13\\src\\homework\\fourth\\userdata.txt"));
        String s;
        TestTime.test();
        while((s = bufferedReader.readLine())!=null){
            String[] split = s.split(",");
            arrayList.add(new User(split[0],split[1],split[2]));
        }
       long result= TestTime.test();
        bufferedReader.close();
        return result;



    }


}
