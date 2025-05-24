package com.onesion.pattern.singleton.demo7;

/**
 * @author onesion
 * @version 1.0
 * @description
 *      懒汉式：静态内部类
 * @date 2025/5/24 13:56
 */
public class Singleton {

    // 私有构造方法
    private Singleton() {}

    // 定义一个静态内部类
    private static class SingletonHolder {
        // 在内部类中声明并初始化外部类的对象
        private static final Singleton INSTANCE = new Singleton();  // 为了防止外界修改，final修改，习惯全大写
    }

    // 提供公共的访问方式
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
