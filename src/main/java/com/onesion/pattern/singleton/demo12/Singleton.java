package com.onesion.pattern.singleton.demo12;

/**
 * @author onesion
 * @version 1.0
 * @description 解决 反射破坏单例模式
 * @date 2025/5/25 12:57
 */
public class Singleton {

    private static boolean flag = false;

    // 私有构造方法
    private Singleton() {

        synchronized (Singleton.class) {
            // 判断flag的值是否是true，如果是true，说明非第一次访问，直接抛一个异常，如果是false的话，说明第一次访问
            if (flag) {
                throw new RuntimeException("不能创建多个对象");
            }

            // 将flag的值设置为true
            flag = true;
        }

    }

    // 定义一个静态内部类
    private static class SingletonHolder {
        // 在内部类中声明并初始化外部类的对象
        private static final Singleton INSTANCE = new Singleton();
    }
    private static volatile Singleton instance;

    // 提供公共的访问方式
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }


}
