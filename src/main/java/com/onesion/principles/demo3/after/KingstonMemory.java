package com.onesion.principles.demo3.after;

/**
 * @author onesion
 * @version 1.0
 * @description 金士顿内存条类
 * @date 2025/3/15 16:48
 */
public class KingstonMemory implements Memory{

    @Override
    public void save() {
        System.out.println("使用金士顿内存条");
    }
}
