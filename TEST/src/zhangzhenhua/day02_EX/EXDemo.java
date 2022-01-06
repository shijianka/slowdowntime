package zhangzhenhua.day02_EX;

public class EXDemo {
    public static void main(String[] args) {
        try {
            int[] arr = {1,2,3,4};
            System.out.println(111);
            System.out.println(arr[10]);
            System.out.println(111);

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("haha");
        }
        System.out.println("嘿嘿恶化");
    }
}
