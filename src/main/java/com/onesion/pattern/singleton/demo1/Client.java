package com.onesion.pattern.singleton.demo1;

/**
 * @author onesion
 * @version 1.0
 * @description 测试类
 * @date 2025/5/23 21:42
 */
public class Client {
    public static void main(String[] args) {
        // 创建Singleton类的对象
        Singleton instance = Singleton.getInstance();

        Singleton instance1 = Singleton.getInstance();

        // 判断获取到的两个是否是同一个对象
        System.out.println(instance == instance1);
    }
}
