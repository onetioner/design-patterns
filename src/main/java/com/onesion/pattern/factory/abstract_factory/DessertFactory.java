package com.onesion.pattern.factory.abstract_factory;

/**
 * @author onesion
 * @version 1.0
 * @description 抽象工厂
 * @date 2025/5/28 21:32
 */
public interface DessertFactory {

    // 生产咖啡的功能
    Coffee createCoffee();

    // 生产甜品的功能
    Dessert createDessert();

}
