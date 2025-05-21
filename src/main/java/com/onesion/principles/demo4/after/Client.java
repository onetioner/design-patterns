package com.onesion.principles.demo4.after;

/**
 * @author onesion
 * @version 1.0
 * @description 测试类
 * @date 2025/5/21 21:27
 */
public class Client {
    public static void main(String[] args){
        // 创建黑马安全门对象
        HeimaSafetyDoor heimaSafetyDoor = new HeimaSafetyDoor();
        // 调用功能
        heimaSafetyDoor.antiTheft();
        heimaSafetyDoor.fireProof();
        heimaSafetyDoor.waterproof();

        System.out.println("=====================");
        // 创建传智安全门对象
        ItcastSafetyDoor itcastSafetyDoor = new ItcastSafetyDoor();
        // 调用功能
        itcastSafetyDoor.antiTheft();
        itcastSafetyDoor.fireProof();
    }
}
