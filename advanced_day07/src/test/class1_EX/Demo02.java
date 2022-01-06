package test.class1_EX;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Student s =new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = scanner.next();
        s.setName(name);

        while (true) {
            try {
                System.out.println("请输入年龄：");
                String  sage = scanner.next();
                int age= Integer.parseInt(sage);
                s.setAge(age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("请输入一个整数");
                continue;
            }catch (RuntimeException e){
                System.out.println("请输入人一个符合范围的年龄");
                continue;
            }

        }
        System.out.println(s);
    }
}
