package homework;

import java.util.Scanner;

/**
 * @author slowdowntime
 * @version 1.0
 * @description: TODO
 * @date 2022/1/1 12:00
 */
public class PlayList {
    Scanner scanner = new Scanner(System.in);
    Function function = new Function();

    public void playList() {
        System.out.println("******************************************************\n" +
                "         ****播放列表管理****\n" +
                "         1--将歌曲添加到主播放列表\n" +
                "         2--将歌曲添加到普通放列表\n" +
                "         3--通过歌曲id查询播放列表中的歌曲\n" +
                "         4--将歌曲名称查询播放列表中的歌曲\n" +
                "         5--修改播放列表中的歌曲\n" +
                "         6--删除播放列表中的歌曲\n" +
                "         7--显示播放列表中的所有歌曲\n" +
                "         8--导出菜单\n" +
                "         9--返回上一级菜单\n" +
                "******************************************************");
        System.out.println("请输入对应的数字进行操作：");
        int choose = scanner.nextInt();
       /* switch (choose) {
            case 1:
                function.addMusicToMain();
                break;
            case 2:
                function.addMusicToGeneral();
                break;
            case 3:
                function.findMusicWithId();
                break;
            case 4:
                function.findMusicWithName();
                break;
            case 5:
                function.reviseMusicOfList();
                break;
            case 6:
                function.deleteMusicOfList();
                break;
            case 7:
                function.showAllMusic();
                break;
            case 8:
                function.exportMenu();
                break;
            case 9:
                function.returnPreviousMenu();
                break;
            default:
                    System.out.println("输入有误");
        }*/
    }
}
