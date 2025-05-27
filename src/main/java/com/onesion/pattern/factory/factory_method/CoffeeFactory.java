package com.onesion.pattern.factory.factory_method;

/**
 * @author onesion
 * @version 1.0
 * @description CoffeeFactory：抽象工厂
 * @date 2025/5/27 22:14
 */
public interface CoffeeFactory {

    // 创建咖啡对象的方法
    Coffee createCoffee();
}
