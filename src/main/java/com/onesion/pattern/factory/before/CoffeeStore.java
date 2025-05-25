package com.onesion.pattern.factory.before;

/**
 * @author onesion
 * @version 1.0
 * @description 咖啡店类
 * @date 2025/5/25 14:05
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        // 声明Coffee类型的变量，根据不同类型创建不同的Coffee子类对象
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，你所点的咖啡没有");
        }

        // 添加配料
        coffee.addMilk();
        coffee.addSugar();

        return coffee;

    }

}
