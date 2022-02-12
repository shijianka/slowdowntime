package day08.question2.entry;

import day08.question2.doamin.Salary;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Entry {

    public static void main(String[] args) {

        // 创建各个学科的平均薪资对象
        Salary javaEESalary = new Salary("JavaEE" , 15756) ;
        Salary htmlSalary = new Salary("HTML&JS+前端" , 14400) ;
        Salary pythonSalary = new Salary("Python+大数据库开发" , 17124) ;
        Salary smartSalary = new Salary("人工智能开发" , 22643) ;
        Salary uiSalary = new Salary("UI/UE设计" , 11530) ;
        Salary testSalary = new Salary("软件测试" , 13145) ;
        Salary mediaSalary = new Salary("新媒体+短视频直播运营" , 11307) ;
        Salary productSalary = new Salary("产品经理" , 16176) ;

        // 补全代码
        TreeSet<Salary> treeSet = new TreeSet<>(new Comparator<Salary>() {
            @Override
            public int compare(Salary o1, Salary o2) {
                int i = o2.getSalary() - o1.getSalary();
                return i;
            }
        });
        treeSet.add(javaEESalary);
        treeSet.add(htmlSalary);
        treeSet.add(pythonSalary);
        treeSet.add(smartSalary);
        treeSet.add(uiSalary);
        treeSet.add(testSalary);
        treeSet.add(mediaSalary);
        treeSet.add(productSalary);
        Iterator<Salary> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            Salary next = iterator.next();
            System.out.println(next);
        }


    }

}
