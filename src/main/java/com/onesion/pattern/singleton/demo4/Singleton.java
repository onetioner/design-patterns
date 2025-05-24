package com.onesion.pattern.singleton.demo4;

/**
 * @author onesion
 * @version 1.0
 * @description
 *      懒汉式：线程安全
 * @date 2025/5/24 13:23
 */
public class Singleton {

    // 私有构造方法
    private Singleton() {}

    // 声明Singleton类型的对象instance
    private static Singleton instance;

    // 对外提供访问方式
    public static synchronized Singleton getInstance() {  // synchronized修饰
        // 判断instance是否为null，如果为null，说明还没有创建Singleton类的对象
        // 如果没有，创建一个并返回，如果有，直接返回即可
        if (instance == null) {
            // 线程1等待，线程2获取到cpu的执行权，也会进入到该判断里面

            instance = new Singleton();

        }

        return instance;
    }
}
