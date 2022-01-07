package test.class6_反射_获取成员变量并使用;

import java.lang.reflect.Field;

public class Reflect {
    public static void main(String[] args) throws NoSuchFieldException, InstantiationException, IllegalAccessException {
        Class aClass = new Student().getClass();

        Field[] fields = aClass.getFields();
        Field name = aClass.getField("name");
        Field[] declaredFields = aClass.getDeclaredFields();
        Field age = aClass.getDeclaredField("age");
        System.out.println(name);
        System.out.println("=====================");
        System.out.println(age);
        System.out.println("=====================");
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("=====================");
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("######################");
        Student student =(Student) aClass.newInstance();
        name.set(student,"zhangsan");
        System.out.println(student);
        System.out.println("=====================");
        age.setAccessible(true);
        age.set(student,100);
        System.out.println(student);
        }
}
