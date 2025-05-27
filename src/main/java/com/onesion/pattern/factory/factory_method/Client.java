package com.onesion.pattern.factory.factory_method;

/**
 * @author onesion
 * @version 1.0
 * @description 测试类
 * @date 2025/5/27 22:25
 */
public class Client {

    public static void main(String[] args) {
        // 创建咖啡店对象
        CoffeeStore coffeeStore = new CoffeeStore();

        // 创建对象并设置
        // CoffeeFactory factory = new AmericanCoffeeFactory();
        CoffeeFactory factory = new LatteCoffeeFactory();
        coffeeStore.setCoffeeFactory(factory);

        // 点咖啡
        Coffee coffee = coffeeStore.orderCoffee();

        System.out.println(coffee.getName());
    }
}
