package com.onesion.pattern.factory.factory_method;

/**
 * @author onesion
 * @version 1.0
 * @description 咖啡类
 * @date 2025/5/27 22:08
 */
public abstract class Coffee {

    // 获取名字，抽象方法，因此类也要抽象类
    public abstract String getName();

    // 加糖
    public void addSugar() {
        System.out.println("加糖");
    }

    // 加奶
    public void addMilk() {
        System.out.println("加奶");
    }
}
