package test.class5_反射_利用Constructor创建对象;

public class Student {
    private String name;
    private int age;

    private Student(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        System.out.println("看看我执行了吗");
        this.name = name;
        this.age = age;
    }

    private Student(String name) {
        this.name = name;
    }

    public Student() {
    }
}
