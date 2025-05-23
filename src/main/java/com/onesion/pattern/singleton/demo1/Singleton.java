package com.onesion.pattern.singleton.demo1;

/**
 * @author onesion
 * @version 1.0
 * @description
 *      饿汉式：静态成员变量
 * @date 2025/5/23 21:34
 */
public class Singleton {

    // 1. 私有构造方法
    private Singleton() {}

    // 2. 在本类中创建本类对象
    private static Singleton instance = new Singleton();

    // 3. 提供一个公共的访问方式，让外界获取该对象  【这里静态是因为外界不能创建该类对象，不能调用非静态方法】
    public static Singleton getInstance() {
        return instance;  // 静态不能直接访问非静态，所以instance要用静态修饰
    }
}
