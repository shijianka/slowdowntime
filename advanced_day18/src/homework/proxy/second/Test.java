package homework.proxy.second;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        Seller seller = new Dell();
        Class[] interfaces={Seller.class};
        Seller proxy = (Seller) Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader(),
                interfaces,
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        String name = method.getName();
                        if("sell".equals(name)){
                            int arg =(int) args[0];
                            arg-=1000;
                            args[0]=arg;
                           Object result= method.invoke(seller,args);
                           return result;
                        }else {
                          Object result =  method.invoke(seller,args);
                            return result;
                        }
                    }
                }
        );
        String sell = proxy.sell(12000);
        System.out.println(sell);
        proxy.repair(100);
    }
}
