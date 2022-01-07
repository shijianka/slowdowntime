package test.class02_类加载器常用方法;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 加载资源文件，放到输入流中
 *   InputStream resourceAsStream = systemClassLoader.getResourceAsStream("prop.properties");
 *
 *   用Properties把流中的数据存到集合中
 *   Properties properties = new Properties();
 *         properties.load(resourceAsStream);
 */
public class ClassLoader2 {
    public static void main(String[] args) throws IOException {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        InputStream resourceAsStream = systemClassLoader.getResourceAsStream("prop.properties");
        Properties properties = new Properties();
        properties.load(resourceAsStream);
        System.out.println(properties);
        resourceAsStream.close();
    }
}
