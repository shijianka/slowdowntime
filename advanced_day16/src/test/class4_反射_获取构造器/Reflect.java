package test.class4_反射_获取构造器;

import java.lang.reflect.Constructor;

public class Reflect {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class aClass = Class.forName("test.class4_反射_获取构造器.Student");
//        getConstructorsMethod(aClass);

//        getDeclaredConstructorsMethod(aClass);

//        getConstructorMethod(aClass);

        Constructor declaredConstructor = aClass.getDeclaredConstructor(int.class);
        System.out.println(
                declaredConstructor
        );

    }

    private static void getConstructorMethod(Class aClass) throws NoSuchMethodException {
        Constructor constructor = aClass.getConstructor(String.class);
        System.out.println(constructor);
    }

    private static void getDeclaredConstructorsMethod(Class aClass) {
        Constructor[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
    }

    private static void getConstructorsMethod(Class aClass) {
        Constructor[] constructors = aClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(
                    constructor
            );
        }
    }
}
