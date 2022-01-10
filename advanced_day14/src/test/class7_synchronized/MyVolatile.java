package test.class7_synchronized;

public class MyVolatile {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        Thread thread1 = new Thread(test1);
        thread1.setName("小美");
        Test2 test2 = new Test2();
        Thread thread2 = new Thread(test2);
        thread2.setName("小帅");

        thread1.start();
        thread2.start();
    }
}
