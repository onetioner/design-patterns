package com.onesion.principles.demo2.before;

/**
 * @author onesion
 * @version 1.0
 * @description 正方形类
 * @date 2025/3/11 20:20
 */
public class Square extends Rectangle{

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
}
