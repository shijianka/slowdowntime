package proxy.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class Test {


    public static void main(String[] args) {
        //2.创建被代理对象
        Seller seller = new Lenovo();

        //需求：销量慢慢在减少，需要服务升级：车接，车送，赠送鼠标垫
        //3.创建代理对象
        /*
            固定的格式：
                Proxy.newProxyInstance(
                    ClassLoader loader, 类加载器，ClassLoader.getSystemClassLoader()
                    Class[] interfaces, 代理对象需要实现哪些接口，就是由这个参数指定 Class[] interfaces = {Seller.class};
                    InvocationHandler h,是个接口,需要传递该接口的实现类对象,里面的invoke方法，用来提供服务，增强的代码都需要写到这里

                                new InvocationHandler() {
                                    每当用户使用代理对象，调用一次方法，那么这个invoke方法就会执行一次
                                    @Override
                                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                                        return null;
                                    }
                                }
                )
         */
        Class[] interfaces = {Seller.class};
        Seller proxy = (Seller) Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader()
                ,
                interfaces
                ,
                new InvocationHandler() {
                    //每当用户使用代理对象，调用一次方法，那么这个invoke方法就会执行一次

                    /**
                     * @param proxy  生成的代理对象  该参数一般不使用
                     * @param method  描述当前正在被调用的方法，用户使用代理对象调用哪个方法，method描述的就是哪个方法
                     * @param args  用户调用方法时，传递的参数
                     * @return 执行完方法后的结果
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //找被代理对象，用户调用method，执行 被代理对象的method
                        Object result = method.invoke(seller, args);
                        return result;
                    }
                }
        );


        //4.用户使用代理对象调用方法
        String sell = proxy.sell(12000);
        System.out.println(sell);
        System.out.println("**********************************");
        proxy.repair(800);


    }
}
