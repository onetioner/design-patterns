package com.onesion.pattern.singleton.demo2;

/**
 * @author onesion
 * @version 1.0
 * @description
 *      饿汉式：静态代码块
 * @date 2025/5/23 21:48
 */
public class Singleton {

    // 私有构造方法
    private Singleton() {}

    // 声明Singleton类型的变量
    private static Singleton instance;  // null

    // 在静态代码块中进行赋值
    static {
        instance = new Singleton();
    }

    // 对外提供获取该类对象的方法
    public static Singleton getInstance() {
        return instance;
    }
}
