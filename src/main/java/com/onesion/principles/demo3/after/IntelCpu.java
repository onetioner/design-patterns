package com.onesion.principles.demo3.after;

/**
 * @author onesion
 * @version 1.0
 * @description Intel处理器类
 * @date 2025/3/15 16:46
 */
public class IntelCpu implements Cpu{

    @Override
    public void run() {
        System.out.println("使用Intel处理器");
    }
}
