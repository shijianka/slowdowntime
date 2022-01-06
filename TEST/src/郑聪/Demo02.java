package 郑聪;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * @author Mobile-Zheng
 * @date 2021-12-23 21:47
 */

/**
 * 给定一个字符串 s 和一些 长度相同 的单词 words 。找出 s 中恰好可以由 words 中所有单词串联形成的子串的起始位置。
 * 注意子串要与 words 中的单词完全匹配，中间不能有其他字符 ，但不需要考虑 words 中单词串联的顺序。
 * <p>
 * 输入：s = "barfoothefoobarman", words = ["foo","bar"]
 * 输出：[0,9]
 */

public class Demo02 {
    public static void main(String[] args) {
        String s1 = "wordgoodgoodgoodbestword";
        String s11 = "barfoofoobarthefoobarman";
        String s2 = "barfoothefoobarman";
        String[] array = {"word", "good", "best", "word"};
        String[] array2 = {"bar","foo","the"};
        System.out.println(stringJudges(s11, array2));
    }

    public static List<Integer> stringJudges(String s, String[] words) {
        if (s == null || words == null) {
            return null;
        }
        // 获取单个单词的长度
        int len = words[0].length();
        // 获取数组所有单词的长度总和
        int lenFull = len * words.length;
        // 定义保存数组单词的Map 集合
        TreeMap<String, Integer> conMap = new TreeMap<>();
        // 定义保存结果的集合.
        List<Integer> result = new ArrayList<>();
        // 遍历数组. 将每个单词添加到Map集合
        for (String ss : words) {
            conMap.put(ss, conMap.getOrDefault(ss, 0) + 1);
        }
        // 遍历字符串- i 会作乘法运算取元素值.
        for (int i = 0; i <= s.length() - lenFull; i++) {
            // 定义临时保存字符串截取的子串的Map集合
            TreeMap<String, Integer> fullMap = new TreeMap<>();
            // 定义标签
            boolean flag = true;
            // 定义循环次数为数组的长度. 确保   截取单词的数量等于数组的元素数量
            for (int j = 0; j < words.length; j++) {
                // 截取数组单词长度的字符串子串
                String tempString = s.substring(i + j * len, i + (j + 1) * len);
                // 保存子串到Map集合中
                fullMap.put(tempString, fullMap.getOrDefault(tempString, 0) + 1);
                // 对比子串集合是否与数组单词集合 子串集合中有的 数组单词没有的直接break
                if (fullMap.get(tempString) > conMap.getOrDefault(tempString, 0)) {
                    // 满足条件代表当前子串集合与数组单词集合不匹配
                    flag = false;
                    break;
                }
            }
            // 满足条件.
            if (flag) {
                result.add(i);
            }
        }
        return result;
    }
}
