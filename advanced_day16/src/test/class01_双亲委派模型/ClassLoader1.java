package test.class01_双亲委派模型;

public class ClassLoader1 {
    public static void main(String[] args) {
        //获得系统类加载器
        java.lang.ClassLoader systemClassLoader = java.lang.ClassLoader.getSystemClassLoader();
        //获得系统类加载器的父类加载器--平台加载器
        java.lang.ClassLoader classLoader1 = systemClassLoader.getParent();
        //获取平台类加载器的父类加载器--启动类加载器
        java.lang.ClassLoader classLoader2 = classLoader1.getParent();

        System.out.println("系统类加载器"+systemClassLoader);
        System.out.println("平台类加载器"+classLoader1);
        System.out.println("启动类加载器"+classLoader2);


    }
}
