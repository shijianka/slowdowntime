package test.class4_可变参数;

/**
 * @author slowdowntime
 * @version 1.0
 * @description: TODO
 * @date 2021/12/28 21:36
 */
public class MyVariableParameter1 {
    public static void main(String[] args) {

        int sum = getSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        System.out.println(sum);

    }
    public static  int getSum(int...arr){
       int sum = 0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
}
