package com.onesion.pattern.singleton.demo7;

/**
 * @author onesion
 * @version 1.0
 * @description 测试类
 * @date 2025/5/24 14:02
 */
public class Client {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();

        Singleton instance1 = Singleton.getInstance();

        System.out.println(instance == instance1);
    }
}
