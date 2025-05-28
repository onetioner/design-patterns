package com.onesion.pattern.factory.abstract_factory;

/**
 * @author onesion
 * @version 1.0
 * @description
 *      美式风味的甜品工厂：
 *          生产美式咖啡和抹茶慕斯
 * @date 2025/5/28 21:34
 */
public class AmericanDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchMousse();
    }
}
