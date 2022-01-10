package test.class6_volatile;

public class Test1 implements Runnable{


    @Override
    public void run() {

        while (true){
            synchronized (Money.lock) {
                if (Money.money!=100000){
                    System.out.println("已经不是十万了");
                    break;
                }
            }
        }


    }

}
