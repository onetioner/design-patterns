package com.onesion.principles.demo3.after;

/**
 * @author onesion
 * @version 1.0
 * @description 硬盘接口
 * @date 2025/3/15 17:03
 */
public interface HardDisk {

    // 存储数据
    public void save(String data);

    // 获取数据
    public String get();
}
