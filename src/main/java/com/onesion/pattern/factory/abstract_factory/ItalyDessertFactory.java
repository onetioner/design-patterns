package com.onesion.pattern.factory.abstract_factory;

/**
 * @author onesion
 * @version 1.0
 * @description
 *      意大利风味甜品工厂：
 *          生产拿铁咖啡和提拉米苏
 * @date 2025/5/28 21:38
 */
public class ItalyDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
