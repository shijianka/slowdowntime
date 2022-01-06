package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.TreeSet;

/**
 * @author slowdowntime
 * @version 1.0
 * @description: TODO
 * @date 2021/12/27 22:13
 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<String>[] card = getCard();
        看牌(card);

    }

    /**
     * 需求：
     * 请使用HashMap模拟斗地主（3人斗地主）：
     * 1.准备牌；
     * 循环嵌套，外层循环：黑红梅方  内层循环：1-K
     * 往容器存储 ♦4..   小王 大王
     * 2.发牌；
     * 有四个容器，分别随机存储各自的牌
     * 3.看牌；
     * 打印四个容器内容
     */
    public static HashMap<Integer, String> ready() {
        String[] color = {"♠", "♥", "♣", "♦"};
        String[] number = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] card = new String[54];
        int indexCard = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                card[indexCard++] = color[i] + number[j];
            }
        }
        card[52] = "小王";
        card[53] = "大王";
        HashMap<Integer, String> cardBox = new HashMap<>();
        for (int i = 0; i < 54; i++) {
            cardBox.put(i, card[i]);
        }
        return cardBox;
    }

    public static ArrayList<String>[] getCard() {
        HashMap<Integer, String> 张三 = new HashMap<>();
        HashMap<Integer, String> 小三 = new HashMap<>();
        HashMap<Integer, String> 大三 = new HashMap<>();
        ArrayList<String> zhangsan = new ArrayList<>();
        ArrayList<String> lisi = new ArrayList<>();
        ArrayList<String> wangwu = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
       /* TreeSet<String> 张三 = new TreeSet<>(

                (String s1,String s2)->{
                    int result;
                    result = s1.charAt(1) - s2.charAt(1);
                    result=result==0?1:result;
                    if(s2.charAt(1)=='2'&&s1.charAt(1)=='王'){
                        result = -1;
                    }else if(s2.charAt(1)=='2'&&s1.charAt(1)!='王'){
                        result=1;
                    }
                    if(s1.equals("大王")){
                        result=-1;
                    }
                    if(s2.equals("大王")){
                        result=1;
                    }

                    return result;
                }
        );
        TreeSet<String> 李四 = new TreeSet<>();
        TreeSet<String> 王五 = new TreeSet<>();
        TreeSet<String> 底牌 = new TreeSet<>();*/
        int[] arr1 = new int[17];
        int[] arr2 = new int[17];
        int[] arr3 = new int[17];
        int[] arr4 = new int[3];
        int[] arr = new int[54];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        洗牌(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i<17){
                arr1[count]=arr[i];
                count=count++==16?0:count;

            }else if(i>=17&&i<34){
                arr2[count]=arr[i];
                count=count++==16?0:count;

            }else if(i>=34&&i<51){
                arr3[count]=arr[i];
                count=count++==16?0:count;

            }else {
                arr4[count]=arr[i];
                count++;
            }
        }
        拿牌(zhangsan,arr1);
        拿牌(lisi,arr2);
        拿牌(wangwu,arr3);
        拿牌(dipai,arr4);
        ArrayList[] arrayLists = {zhangsan,lisi,wangwu,dipai};
        return  arrayLists;
    }
    public static void 拿牌(ArrayList<String> list, int[] arr ){
        HashMap<Integer, String> ready = ready();
        for(int i = 0; i <arr   .length;i++) {
            list.add(ready.get(arr[i]));
        }
    }

    public static void 洗牌(int[] arr) {
        /**
         * 洗牌：直接在牌库中彻底洗牌
         */
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int first = i;
            int second = Math.abs (random.nextInt()) % 53;
            arr[first] = arr[first] ^ arr[second];
            arr[second] = arr[first] ^ arr[second];
            arr[first] = arr[first] ^ arr[second];
        }
    }
    public static void 看牌(ArrayList<String>[] arrayLists){
        int count=0;
        for (ArrayList<String> arrayList : arrayLists) {
            if(count==0){
                System.out.print("zhangsan:");
                count++;
            }else if(count==1){
                System.out.print("lisi:");
                count++;
            }else if(count==2){
                System.out.print("wangwu:");
                count++;
            }else if(count==3){
                System.out.print("dipai:");

            }
            for (String s : arrayList) {
                System.out.print(s+",");
            }
            System.out.println();
        }
    }
}
