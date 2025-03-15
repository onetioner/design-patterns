package com.onesion.principles.demo2.before;

/**
 * @author onesion
 * @version 1.0
 * @description 测试类
 * @date 2025/3/11 20:23
 */
public class RectangleDemo extends Rectangle {

    // 主方法，用于测试
    public static void main(String[] args) {
        // 创建长方形对象
        Rectangle rectangle = new Rectangle();
        // 设置长和宽
        rectangle.setLength(20);
        rectangle.setWidth(10);
        // 调用resize方法进行扩宽
        resize(rectangle);
        // 打印长宽
        printLengthAndWidth(rectangle);

        System.out.println("=====================");

        // 创建正方形对象
        Square square = new Square();
        // 设备长和宽
        square.setLength(10);
        // 调用resize方法进行扩宽
        resize(square);
        // 打印长宽
        printLengthAndWidth(square);
    }

    // 扩宽方法
    public static void resize(Rectangle rectangle) {
        // 判断宽如果比长小，进行扩宽的操作
        while(rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    // 打印长和宽
    public static void printLengthAndWidth(Rectangle rectangle) {
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }
}
