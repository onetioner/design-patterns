package com.onesion.pattern.singleton.demo6;

/**
 * @author onesion
 * @version 1.0
 * @description
 *      懒汉式：双重检查方式（优化）
 * @date 2025/5/24 13:44
 */
public class Singleton {

    // 私有构造方法
    private Singleton() {}

    // 声明Singleton类型的变量
    private static volatile Singleton instance;  // volatile修饰，保证指令是有序的

    // 对外提供公共的访问方式
    public static Singleton getInstance() {
        // 第一次判断，如果instance的值不为null，不需要抢占锁，直接返回对象
        if (instance == null) {
            synchronized (Singleton.class) {
                // 第二次判断
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
