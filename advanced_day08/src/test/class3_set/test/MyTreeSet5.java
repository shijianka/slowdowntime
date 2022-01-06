package test.class3_set.test;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 案例：按照字符串长短排序
 * 需求：请自行选择比较器排序和自然排序两种方式
 * 要求：存入四个字符串，"c" "ab" "df" "qwer"
 * 按照长度排序，如果长度一样长按照字母排序
 */
public class MyTreeSet5 {
    public static void main(String[] args) {
       /* TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                int result = o1.length() - o2.length();
                result = result == 0 ? o1.compareTo(o2) : result;
                return result;
            }
        });*/
        TreeSet<String> ts = new TreeSet<>(
                (String o1,String o2)->{
                    int result =o1.length()-o2.length();
                    result = result==0? o1.compareTo(o2):result;
                    return result;
                }
        );
        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");
        System.out.println(ts);
    }
}
