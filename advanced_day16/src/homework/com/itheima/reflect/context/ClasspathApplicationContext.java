package homework.com.itheima.reflect.context;

import java.io.InputStream;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ClasspathApplicationContext implements ApplicationContext {

    // 定义一个容器存储系统中可能使用到的对象
    private static ConcurrentHashMap<String , Object> beans = new ConcurrentHashMap<>();

    // 定义构造方法
    public ClasspathApplicationContext(String fileName) {

        // 补全代码

    }

    @Override
    public <T> T getBean(Class<T> clazz) {

        // 补全代码

        return null;
    }

}
