package proxy.demo2;

public class Lenovo implements Seller {
    @Override
    public void repair(int money) {
        System.out.println("花了"+money+"块，维修好了电脑");
    }

    @Override
    public String sell(int money) {
        System.out.println("花了"+money+"块，卖了一台电脑");
        return "ThinkPad";
    }
}
