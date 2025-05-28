package com.onesion.pattern.factory.abstract_factory;

/**
 * @author onesion
 * @version 1.0
 * @description 测试类
 * @date 2025/5/28 21:40
 */
public class Client {
    public static void main(String[] args) {
        // 创建的是意大利风味甜品工厂
        // ItalyDessertFactory factory = new ItalyDessertFactory();
        AmericanDessertFactory factory = new AmericanDessertFactory();

        // 获取拿铁咖啡和提拉米苏甜品
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();

        System.out.println(coffee.getName());
        dessert.show();
    }
}
