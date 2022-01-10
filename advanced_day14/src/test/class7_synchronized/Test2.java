package test.class7_synchronized;

public class Test2 implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Money.money=0;
    }
}
