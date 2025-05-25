package com.onesion.pattern.singleton.demo12;

import java.lang.reflect.Constructor;

/**
 * @author onesion
 * @version 1.0
 * @description 测试类，解决反射破坏单例模式
 * @date 2025/5/25 13:09
 */
public class Client {

    public static void main(String[] args) throws Exception{
        // 1. 获取Singleton的字节码对象
        Class singletonClass = Singleton.class;

        // 2. 获取无参构造方法对象
        Constructor constructor = singletonClass.getDeclaredConstructor();

        // 3. 取消访问检查
        constructor.setAccessible(true);

        // 4. 创建Singleton对象
        Singleton s1 = (Singleton) constructor.newInstance();
        Singleton s2 = (Singleton) constructor.newInstance();  // 第二次访问会抛出异常

        // 5. 判断通过反射创建的两个Singleton对象是否是同一个对象
        System.out.println(s1 == s2);  // true
    }
}
