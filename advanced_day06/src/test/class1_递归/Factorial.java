package test.class1_递归;

/**
 *  求出1 ~ 100 的和
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println(getSum(100));
    }

    private static int getSum(int i) {
        if(i==1){return 1;}
        else {
            return i+getSum(i-1);
        }
    }
}
