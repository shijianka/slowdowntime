package 第21题;

import java.io.*;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Student> studentSet = new TreeSet<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第"+(i+1)+"个学生姓名：");
            String name = scanner.next();
            System.out.println("请输入"+name+"的语文成绩");
            int Chinese = scanner.nextInt();
            System.out.println("请输入"+name+"的数学成绩");
            int Math = scanner.nextInt();
            System.out.println("请输入"+name+"的英语成绩");
            int English = scanner.nextInt();
            studentSet.add(new Student(name,Chinese,Math,English));
        }
        //学生信息的存放位置
        File file = new File("C:\\root\\Cloud\\OneDrive\\root\\workSpace\\IDEA\\study_itheima\\advanced_exam\\src\\第21题\\学生信息.txt");

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        String head = "姓名,语文成绩，数学成绩，英语成绩\r\n";
        bufferedOutputStream.write(head.getBytes());
        for (Student student : studentSet) {
            bufferedOutputStream.write(student.toString().getBytes());
        }
        bufferedOutputStream.flush();
        System.out.println("数据写入文件完毕");
        System.out.println("文件中的数据展示如下：");
        /*BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String line;
        while( (line=bufferedReader.readLine())!=null ){
            System.out.println(line);
        }
        bufferedReader.close();*/
        FileInputStream fileInputStream=new FileInputStream(file);
        int b;
        byte[] bytes =new byte[1024];
        while ( (b=fileInputStream.read(bytes))!=-1 )
        {
            System.out.println((new String(bytes,0,b)));
        }
        fileInputStream.close();

        bufferedOutputStream.close();


    }
}
