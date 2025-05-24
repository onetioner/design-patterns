package com.onesion.pattern.singleton.demo9;

import java.io.Serializable;

/**
 * @author onesion
 * @version 1.0
 * @description 破坏单例模式
 * @date 2025/5/24 14:17
 */
public class Singleton implements Serializable {  // 实现了Serializable

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
}
