package test.class2_HashSet;

/**
 * @author slowdowntime
 * @version 1.0
 * @description: TODO
 * @date 2021/12/27 14:49
 */
public class HashSetDemo1 {
    public static void main(String[] args) {

        Student xiaohua1 = new Student("xiaohua1", 23);
        Student xiaohua2 = new Student("xiaohua1", 23);
        Student xiaohua3 = new Student("xiaohua3", 24);
        System.out.println("打印对象地址值：");
        System.out.println(xiaohua1);
        System.out.println(xiaohua2);
        System.out.println(xiaohua3);
        //结论1： 通过对象地址值计算HashCode值，同一个对象的hashCode值也是相同的
        /**
         * 打印对象地址值：
         * test.class2_HashSet.Student@4eec7777
         * test.class2_HashSet.Student@3b07d329
         * test.class2_HashSet.Student@41629346
         * 1324119927
         * 1324119927
         * 990368553
         * 1096979270
         * 1096979270
         */
        System.out.println(xiaohua1.hashCode());
        System.out.println(xiaohua1.hashCode());
        System.out.println(xiaohua2.hashCode());
        System.out.println(xiaohua3.hashCode());
        System.out.println(xiaohua3.hashCode());

//结论2：Student类重写了hashCode方法，该方法通过Student对象的所有属性值计算HashCode值
/**
 * 打印对象地址值：
 * Student{name='xiaohua1', age=23}
 * Student{name='xiaohua1', age=23}
 * Student{name='xiaohua3', age=24}
 * -368705925
 * -368705925
 * -368705925
 * -368705862
 * -368705862
 */




    }
}
