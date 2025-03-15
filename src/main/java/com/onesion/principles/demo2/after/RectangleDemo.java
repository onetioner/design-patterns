package com.onesion.principles.demo2.after;

/**
 * @author onesion
 * @version 1.0
 * @description 测试类
 * @date 2025/3/11 20:49
 */
public class RectangleDemo {

    public static void main(String[] args) {
        // 创建长方形对象
        Rectangle rectangle = new Rectangle();
        // 设置长和宽
        rectangle.setLength(20);
        rectangle.setWidth(10);
        // 调用resize方法进行扩宽
        resize(rectangle);
        // 打印长和宽
        printLengthAndWidth(rectangle);
    }

    // 扩宽方法
    public static void resize(Rectangle rectangle) {  // 这里只能传入长方形对象
        // 判断宽如果比长小，进行扩宽的操作
        while(rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    // 打印长和宽
    public static void printLengthAndWidth(Quadrilateral quadrilateral) {
        System.out.println(quadrilateral.getLength());
        System.out.println(quadrilateral.getWidth());
    }
}
