package com.onesion.pattern.singleton.demo11;

import java.io.Serializable;

/**
 * @author onesion
 * @version 1.0
 * @description 使用readResolve()方法 解决 序列化破坏单例模式
 * @date 2025/5/24 15:04
 */
public class Singleton implements Serializable {

    // 私有构造方法
    private Singleton() {}

    // 定义一个静态内部类
    private static class SingletonHolder {
        // 在内部类中声明并初始化外部类的对象
        private static final Singleton INSTANCE = new Singleton();
    }

    // 提供公共的访问方式
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    // 当进行反序列化时，会自动调用该方法，将该方法的返回值直接返回
    public Object readResolve() {
        return SingletonHolder.INSTANCE;
    }
}
