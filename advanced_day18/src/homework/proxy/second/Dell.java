package homework.proxy.second;

public class Dell implements Seller {

    @Override
    public void repair(int money) {
        System.out.println("维修电脑花费"+money+"元");
    }

    @Override
    public String sell(int money) {
        System.out.println("卖出一台电脑，收款"+money+"元");
        return "Dell";
    }
}
