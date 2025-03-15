package com.onesion.principles.demo3.before;

/**
 * @author onesion
 * @version 1.0
 * @description 测试类
 * @date 2025/3/15 16:54
 */
public class ComputerDemo {
    public static void main(String[] args) {
        // 创建组件对象
        XiJieHardDisk hardDisk = new XiJieHardDisk();
        IntelCpu cpu = new IntelCpu();
        KingstonMemory memory = new KingstonMemory();

        // 创建计算机对象
        Computer computer = new Computer();
        // 组装计算机
        computer.setCpu(cpu);
        computer.setHardDisk(hardDisk);
        computer.setMemory(memory);

        // 运行计算机
        computer.run();
    }
}
