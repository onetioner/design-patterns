package com.onesion.pattern.factory.simple_factory;

/**
 * @author onesion
 * @version 1.0
 * @description 咖啡类（未变）
 * @date 2025/5/25 13:59
 */
public abstract class Coffee {

    // 获取名字，抽象方法，类也要抽象类
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
