package homework;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author slowdowntime
 * @version 1.0
 * @description: TODO
 * @date 2021/12/31 10:23
 */
public class fourth {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zs",18));
        list.add(new Student("ls",19));
        list.add(new Student("ww",20));
        list.add(new Student("zl",21));
        File file = new File("advanced_day11\\src\\test\\homework\\fourthTest.txt");
        /**
         * 要求：
         *
         * * 将集合中的元素写到文件中，每一个学生信息占一行，在文件中的效果如下：
         * 张三,18
         * 李四,19
         * 王五,20
         * 赵六,21
         */
        FileOutputStream fileOutputStream = new FileOutputStream(file,true);
        for (Student student : list) {
            fileOutputStream.write(student.toString().getBytes(),0,student.toString().getBytes().length);
        }
        fileOutputStream.close();
    }
}
