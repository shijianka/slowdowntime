package test.class3_反射;

public class Reflect {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz  = Class.forName("test.class3_反射.Student");
        System.out.println(clazz);

        Class studentClass = Student.class;
        System.out.println(studentClass);

        Student s = new Student();
        Class aClass = s.getClass();
        System.out.println(aClass);
    }
}
