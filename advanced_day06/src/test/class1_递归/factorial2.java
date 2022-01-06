package test.class1_递归;

public class factorial2 {
    public static void main(String[] args) {
        System.out.println(getji(5));
    }

    private static int getji(int i) {
        if(i==1){
            return 1;
        }else {
            return i*getji(i-1);
        }
    }
}
