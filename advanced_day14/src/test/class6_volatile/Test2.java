package test.class6_volatile;

public class Test2 implements Runnable{

    @Override
    public void run() {
        synchronized (Money.lock) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Money.money=0;
        }
    }
}
