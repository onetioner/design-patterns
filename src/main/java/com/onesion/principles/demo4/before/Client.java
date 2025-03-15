package com.onesion.principles.demo4.before;

/**
 * @author onesion
 * @version 1.0
 * @description 测试类
 * @date 2025/3/15 17:49
 */
public class Client {

    public static void main(String[] args) {
        HeimaSafetyDoor door = new HeimaSafetyDoor();

        door.antiTheft();
        door.fireProof();
        door.waterProof();
    }
}
