package com.onesion.pattern.singleton.demo10;

import java.lang.reflect.Constructor;

/**
 * @author onesion
 * @version 1.0
 * @description 测试类
 *      测试使用 反射 破坏单例模式
 * @date 2025/5/24 14:40
 */
public class Client {
    public static void main(String[] args) throws Exception{
        // 1. 获取Singleton的字节码对象
        Class singletonClass = Singleton.class;

        // 2. 获取无参构造方法
        Constructor constructor = singletonClass.getDeclaredConstructor();

        // 3. 取消访问检查
        constructor.setAccessible(true);

        // 4. 创建Singleton对象
        Singleton s1 = (Singleton) constructor.newInstance();
        Singleton s2 = (Singleton) constructor.newInstance();

        // 5. 判断通过反射创建的两个Singleton对象是否是同一个对象
        System.out.println(s1 == s2);  // 如果true，说明没有破坏单例模式，如果false，说明破坏了
    }
}
