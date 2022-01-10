package test;

public class 包装类 {
    public static void main(String[] args) {

        Boolean b = true;
        change((Boolean) b);
        System.out.println(b);

    }
    public static void change(Boolean b){
        b=false;
        System.out.println(b.toString());
    }
}
