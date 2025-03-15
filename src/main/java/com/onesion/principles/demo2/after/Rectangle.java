package com.onesion.principles.demo2.after;

/**
 * @author onesion
 * @version 1.0
 * @description 长方形类
 * @date 2025/3/11 20:46
 */
public class Rectangle implements Quadrilateral{

    private double length;

    private double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getLength() {
        return length;  // 返回长
    }

    @Override
    public double getWidth() {
        return width;  // 返回宽
    }
}
