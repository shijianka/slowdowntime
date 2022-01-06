package example.mycollectiondemo1;

import java.util.ArrayList;

public class MyCollectonDemo8 {
    public static void main(String[] args) {

        //         003 004 005 006
        int[] arr = {1,2,3,45};//地址值：003
        //          0  1  2 3












        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("小皮同学",23);
        Student s2 = new Student("小路同学",31);
        Student s3 = new Student("小贾同学",33);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        //使用增强for查询所有同学 //快捷方式 list.for
        for (Student aaa : list) {
            System.out.println(aaa);
        }

        //使用迭代器方式：删除小路同学，查询所有
        /*Iterator<Student> it = list.iterator();
        while (it.hasNext()){
            Student stu = it.next();
            if (stu.getName().equals("小路同学")){
                it.remove();
            }
        }

        Iterator<Student> it2 = list.iterator();
        while (it2.hasNext()){
            Student stu = it2.next();
            System.out.println(stu);
        }*/


        //练习：
        //使用普通for，所有同学年龄修改为88岁，查询所有，删除小皮
        /*for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getName().equals("小皮同学")){
                list.remove(i);
                i--;
            }
            stu.setAge(88);
        }
        System.out.println(list);*/












        //迭代器的方式进行遍历
       /* Iterator<Student> it = list.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s);
        }

        System.out.println("-------------------------");

        //增强for
        for (Student student : list) {
            System.out.println(student);
        }*/
    }
}
