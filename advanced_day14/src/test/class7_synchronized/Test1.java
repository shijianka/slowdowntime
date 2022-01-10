package test.class7_synchronized;

public class Test1 implements Runnable{


    @Override
    public void run() {
        while (true){
            if(Money.money!=100000){
                break;
            }
        }
        System.out.println("已经不是十万了");
    }

}
