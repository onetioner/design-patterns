package com.onesion.pattern.factory.simple_factory;

/**
 * @author onesion
 * @version 1.0
 * @description 简单咖啡工厂类（简单工厂模式）：用来生产咖啡
 * @date 2025/5/25 14:24
 */
public class SimpleCoffeeFactory {

    public Coffee createCoffee(String type) {
        // 声明Coffee类型的变量，根据不同类型创建不同的Coffee子类对象
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，您所点的咖啡没有");
        }

        return coffee;
    }
}
