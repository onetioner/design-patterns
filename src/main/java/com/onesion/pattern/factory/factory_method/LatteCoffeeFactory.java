package com.onesion.pattern.factory.factory_method;

/**
 * @author onesion
 * @version 1.0
 * @description 拿铁咖啡工厂，专门用来生产拿铁咖啡
 * @date 2025/5/27 22:18
 */
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
