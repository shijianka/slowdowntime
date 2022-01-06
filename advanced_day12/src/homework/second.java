package homework;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

/**
 * @author slowdowntime
 * @version 1.0
 * @description: TODO
 * @date 2021/12/31 13:03
 */
public class second {
    public static void main(String[] args) throws IOException {
/**
 * 需求（猜数字小游戏试玩三次）：
 * 	1.程序自动生成一个1~100的数字，提示用户录入用户猜的数字，如果两个数字相同，则游戏结束，如果用户猜的数字不等于生成的数字，则给出响应的提示，并让用户继续猜，直到猜中，游戏结束。
 * 	2.该游戏只能试玩3次，如果第四次运行该游戏，需要提示：游戏试玩已结束，想玩请充值(www.itcast.cn)
 */
        File file = new File("advanced_day12\\src\\homework\\猜数字配置文件.txt");
        start(file);

    }

    private static void start(File file) throws IOException {
        if(!file.exists()||file.isDirectory()){
            System.out.println("游戏配置文件损坏，请检查配置文件或重新安装！");
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file,true);
        int money=0;
        int length;

        while((length=fileInputStream.read())!=-1){
            money+=length;
        }
        fileInputStream.close();
        if(money>=108){
            System.out.println("游戏试玩已结束，想玩请充值(www.itcast.cn)");
            return;
        }

        fileOutputStream.write(36);
        fileOutputStream.close();
        playGame();


    }

    private static void playGame() {
        Random random = new Random();
        int i = random.nextInt(100) + 1;
        System.out.println("请输入你猜的数字：");
        int guessNum = new Scanner(System.in).nextInt();
        while (guessNum!=i){
            if(guessNum>i){
                System.out.println("你猜大了");
            }
            if(guessNum<i){
                System.out.println("你猜小了");
            }
        }
        System.out.println("恭喜你猜对了！");
    }
}
