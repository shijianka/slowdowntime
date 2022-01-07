package test.class7_反射_获得Method对象和运行方法;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflect {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class aClass = new Student().getClass();
        Method test3 = aClass.getMethod("test3",int.class);

        System.out.println(test3);

        Method test2 = aClass.getDeclaredMethod("test2");

        System.out.println(test2);

        System.out.println("===============");
        Student student = (Student) aClass.newInstance();
        Object result = test3.invoke(student, 1);
        System.out.println(result);

    }
}
