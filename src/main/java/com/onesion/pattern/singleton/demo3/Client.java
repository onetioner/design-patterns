package com.onesion.pattern.singleton.demo3;

/**
 * @author onesion
 * @version 1.0
 * @description 测试类
 * @date 2025/5/24 13:15
 */
public class Client {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();

        Singleton instance1 = Singleton.getInstance();

        // 判断两次获取到Singleton对象是否是同一个对象
        System.out.println(instance == instance1);
    }
}
