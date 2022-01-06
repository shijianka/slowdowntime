package test.class2_泛型;

/**
 *
 */
public class Demo01 {
    public static void main(String[] args) {
        Box1<String> stringBox1 = new Box1<>();
        stringBox1.setA("qqqqq");
        System.out.println(stringBox1);


        Box1<Integer> stringBox2 = new Box1<>();
        stringBox2.setA(1236);
        System.out.println(stringBox2);
    }
}

