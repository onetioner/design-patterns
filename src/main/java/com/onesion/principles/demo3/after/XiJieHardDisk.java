package com.onesion.principles.demo3.after;

/**
 * @author onesion
 * @version 1.0
 * @description
 * @date 2025/3/15 16:43
 */
public class XiJieHardDisk implements HardDisk{

    // 存储数据的方法
    @Override
    public void save(String data) {
        System.out.println("使用希捷硬盘存储数据为：" + data);
    }

    // 获取数据的方法
    @Override
    public String get() {
        System.out.println("使用希捷硬盘取数据");
        return "数据";
    }
}
