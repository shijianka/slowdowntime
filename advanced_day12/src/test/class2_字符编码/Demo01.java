package test.class2_字符编码;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author slowdowntime
 * @version 1.0
 * @description: TODO
 * @date 2021/12/31 11:17
 */
public class Demo01 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "中午吃啥呢？";
        byte[] bytes1 = s.getBytes();
        System.out.println(Arrays.toString(bytes1));

        byte[] bytes2 = s.getBytes("UTF-8");
        System.out.println(Arrays.toString(bytes2));

        byte[] bytes3 = s.getBytes("GBK");
        System.out.println(Arrays.toString(bytes3));
        byte[] bytes11 = {-28, -72, -83, -27, -115, -120, -27, -112, -125, -27, -107, -91, -27, -111, -94, -17, -68, -97};
        byte[] bytes22 = {-28, -72, -83, -27, -115, -120, -27, -112, -125, -27, -107, -91, -27, -111, -94, -17, -68, -97};
        byte[] bytes33 = {-42, -48, -50, -25, -77, -44, -55, -74, -60, -40, -93, -65};
        String s1 = new String(bytes11);
        System.out.println(s1);
        String s2 = new String(bytes22);
        System.out.println(s2);
        String s3 = new String(bytes33,"GBk");
        System.out.println(s3);

    }
}
