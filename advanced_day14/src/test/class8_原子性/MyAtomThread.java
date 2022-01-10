package test.class8_原子性;

public class MyAtomThread implements Runnable {
private int count =0;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            count++;
            System.out.println("已经送了"+count+"个冰淇淋");
        }
    }
}
