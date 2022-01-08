package homework.com.itheima.reflect.context;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ClasspathApplicationContext implements ApplicationContext {

    // 定义一个容器存储系统中可能使用到的对象
    private static ConcurrentHashMap<String, Object> beans = new ConcurrentHashMap<>();

    // 定义构造方法
    public ClasspathApplicationContext(String fileName) {

        // 补全代码
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        InputStream inputStream = systemClassLoader.getResourceAsStream(fileName);
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Set<Map.Entry<Object, Object>> entries = properties.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            Class clazz = null;
            try {
                clazz = Class.forName((String) entry.getValue());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            Object o = null;
            if (clazz != null) {
                Constructor constructor = null;
                try {
                    constructor = clazz.getConstructor();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }

                try {
                    o = constructor.newInstance();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
            if (o != null) {
                beans.put((String) entry.getValue(), o);
            }
        }

    }

    @Override
    public <T> T getBean(Class<T> clazz) {

        // 补全代码
        String name = clazz.getName();
        T t1 = (T) beans.get(name);
        if (t1 != null) {
            return t1;
        }
        //若beans集合中没有，则创建对象
        Constructor<T> declaredConstructor = null;
        try {
            declaredConstructor = clazz.getDeclaredConstructor();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        T t2 = null;
        if (declaredConstructor != null) {
            try {
                t2 = declaredConstructor.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        beans.put(name,t2);
        return t2;
    }

}
