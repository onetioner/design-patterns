package com.onesion.pattern.factory.simple_factory;

/**
 * @author onesion
 * @version 1.0
 * @description 咖啡店类，目前不依赖任何具体的咖啡产品对象，解除了咖啡店和具体的产品对象的依赖，实现了解耦合
 * @date 2025/5/25 14:05
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {

        // 创建咖啡简单工厂对象
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();

        // 调用生产咖啡的方法
        Coffee coffee = factory.createCoffee(type);

        // 加配料
        coffee.addMilk();
        coffee.addSugar();

        return coffee;

    }

}
