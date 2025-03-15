package com.onesion.principles.demo3.before;

/**
 * @author onesion
 * @version 1.0
 * @description 希捷硬盘类
 * @date 2025/3/15 16:43
 */
public class XiJieHardDisk {

    // 存储数据的方法
    public void save(String data) {
        System.out.println("使用希捷硬盘存储数据为：" + data);
    }

    // 获取数据的方法
    public String get() {
        System.out.println("使用希捷硬盘取数据");
        return "数据";
    }
}
