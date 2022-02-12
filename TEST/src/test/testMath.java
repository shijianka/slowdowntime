package test;

import java.util.Scanner;

public class testMath {
    public static void main(String[] args) {

       /* int temp = 16;
        double v = Math.log10(temp) / Math.log10(2);
        System.out.println(v);
        //:如果存在一个整数 x 使得 n == 2^x ，则认为 n 是 2 的幂次方!!!!!!!!!!!!!!!!!!!!!!!!

        System.out.println(test());*/

        System.out.println(test());
    }

    public static boolean test() {
        /**
         * 对于： n == 2^x   需求： 如果 x 为整数返回 true,否则返回 false
         */
        double n, x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要判断的结果值：");
        n = scanner.nextDouble();
        x = Math.log(n) / Math.log(2);
        if (x - (int) x != 0) {
            return false;
        }
        return true;
    }
}
