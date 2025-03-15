package com.onesion.principles.demo3.before;

/**
 * @author onesion
 * @version 1.0
 * @description 电脑类
 * @date 2025/3/15 16:50
 */
public class Computer {

    private XiJieHardDisk hardDisk;
    private IntelCpu cpu;
    private KingstonMemory memory;

    public XiJieHardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(XiJieHardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public IntelCpu getCpu() {
        return cpu;
    }

    public void setCpu(IntelCpu cpu) {
        this.cpu = cpu;
    }

    public KingstonMemory getMemory() {
        return memory;
    }

    public void setMemory(KingstonMemory memory) {
        this.memory = memory;
    }

    // 运行计算机的方法
    public void run() {
        System.out.println("运行计算机");

        String data = hardDisk.get();
        System.out.println("从硬盘上获取的数据是：" + data);

        cpu.run();

        memory.save();
    }
}
