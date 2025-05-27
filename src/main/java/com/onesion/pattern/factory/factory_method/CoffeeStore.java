package com.onesion.pattern.factory.factory_method;

/**
 * @author onesion
 * @version 1.0
 * @description 咖啡店类
 * @date 2025/5/27 22:19
 */
public class CoffeeStore {

    private CoffeeFactory factory;

    public void setCoffeeFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    // 点咖啡功能
    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();

        // 加配料
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}
