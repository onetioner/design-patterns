package com.onesion.pattern.singleton.demo8;

/**
 * @author onesion
 * @version 1.0
 * @description 测试类
 * @date 2025/5/24 14:08
 */
public class Client {

    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;

        Singleton instance1 = Singleton.INSTANCE;

        System.out.println(instance == instance1);
    }
}
