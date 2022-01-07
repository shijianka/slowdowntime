package test.class5_反射_利用Constructor创建对象;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Reflect {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Class  aClass = new Student().getClass();
        Constructor declaredConstructor = aClass.getDeclaredConstructor(String.class, int.class);
        Student student =(Student) declaredConstructor.newInstance("张三", 23);
        System.out.println(student);

        //在Class类中，有newInstance可以直接创建空参对象
        Student o =(Student) aClass.newInstance();
        System.out.println(o);
        //获取一个私有化构造方法
        Constructor declaredConstructor1 = aClass.getDeclaredConstructor(String.class);
        declaredConstructor1.setAccessible(true);
        Student zhangsansan =(Student) declaredConstructor1.newInstance("zhangsansan");
        System.out.println(zhangsansan);
    }
}
