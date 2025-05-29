package com.onesion.pattern.factory.config_factory;

/**
 * @author onesion
 * @version 1.0
 * @description 测试类
 * @date 2025/5/29 21:37
 */
public class Client {
    public static void main(String[] args) {
        Coffee american = CoffeeFactory.createCoffee("american");
        System.out.println(american.getName());

        System.out.println("==============");
        Coffee latte = CoffeeFactory.createCoffee("latte");
        System.out.println(latte.getName());

    }
}
