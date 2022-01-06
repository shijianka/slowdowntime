package homework;

import java.util.Scanner;

/**
 * @author slowdowntime
 * @version 1.0
 * @description: TODO
 * @date 2022/1/1 11:52
 */
public class 用户界面 {
    public static void main(String[] args) {
        System.out.println(
                "***************************************\n"+
                "           ****主菜单*****\n" +
                "           1--播放列表管理\n" +
                "           2--播放器管理\n" +
                "           0--退出\n"+
                "***************************************");
        System.out.println("请输入对应的数字进行操作：");
        int choose = new Scanner(System.in).nextInt();
        switch (choose){
            case 1:
                new PlayList().playList();
        }
    }

}
