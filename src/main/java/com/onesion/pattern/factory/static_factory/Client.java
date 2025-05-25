package com.onesion.pattern.factory.static_factory;

/**
 * @author onesion
 * @version 1.0
 * @description 测试类（未变）
 * @date 2025/5/25 14:09
 */
public class Client {

    public static void main(String[] args) {
        // 1. 创建咖啡店类对象
        CoffeeStore coffeeStore = new CoffeeStore();

        // 2. 点咖啡
        Coffee latte = coffeeStore.orderCoffee("latte");

        System.out.println(latte.getName());
    }
}
