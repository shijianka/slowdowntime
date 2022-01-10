package homework.proxy.first;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        //创建被代理的对象

        Seller seller = new Lenovo();
        //销量慢慢在减少，需要服务升级，车接车送赠送鼠标垫
        Class[] interfaces = {Seller.class};
        Seller proxy = (Seller) Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader(),
                interfaces,
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //提供服务
                        //获取到正在被调用的方法的名字
                        String name = method.getName();
                        if("sell".equals(name)){
                            System.out.println("车接");
                            int args1 =(int) args[0];
                            args1-=2000;
                            args[0]=args1;
                            Object result = method.invoke(seller, args);
                            System.out.println("车送");
                            return result+"+鼠标垫";
                        }else {

                            Object invoke = method.invoke(seller, args);
                            return  invoke;
                        }



                    }
                }
        );
        //用户使用代理对象调用方法
        String sell = proxy.sell(12000);
        System.out.println(sell);
        System.out.println("=======================");
        proxy.repair(800);
    }
}
