package com.onesion.principles.demo2.after;

/**
 * @author onesion
 * @version 1.0
 * @description 正方形类
 * @date 2025/3/11 20:43
 */
public class Square implements Quadrilateral{

    // 边长
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getLength() {
        return side;  // 返回边长
    }

    @Override
    public double getWidth() {
        return side;  // 返回边长
    }
}
