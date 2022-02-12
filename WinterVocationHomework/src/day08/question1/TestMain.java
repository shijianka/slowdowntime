package day08.question1;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class TestMain {
    static Random random = new Random();

    public static void main(String[] args) {
        //红色号码 red ; 蓝色号码 blue
        TreeSet<Integer> red = new TreeSet<>();
        int blue = 0;
        //生成红色号码
        addToRed(red);
        //生成蓝色号码
        blue = addToBlue();
        //打印展示
        print(red, blue);
    }

    private static void print(TreeSet<Integer> red, int blue) {
        System.out.println("红球："+red+" | 蓝球:"+blue);
    }

    private static int addToBlue() {
        return Math.abs(random.nextInt() % 16) + 1;
    }


    private static void addToRed(TreeSet<Integer> red) {
        Loop:
        for (int i = 0; i < 6; i++) {
            int temp = Math.abs(random.nextInt() % 33) + 1;
            Iterator<Integer> iterator = red.iterator();
            while (iterator.hasNext()) {
                Integer next = iterator.next();
                if (temp == next) {
                    i--;
                    continue Loop;
                }
            }
            red.add(temp);
        }
    }
}
