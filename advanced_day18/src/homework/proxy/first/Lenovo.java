package homework.proxy.first;

public class Lenovo implements Seller{


    @Override
    public void repair(int money) {
        System.out.println("修电脑花费了"+money+"元");
    }

    @Override
    public String sell(int money) {
        System.out.println("买电脑花费了"+money+"元");
        return "Dell";
    }
}
