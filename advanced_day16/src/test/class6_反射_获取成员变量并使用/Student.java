package test.class6_反射_获取成员变量并使用;

public class Student {
    public String name;
    private int age;
    public String id;
    private String phone;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
