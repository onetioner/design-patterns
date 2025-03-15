package com.onesion.principles.demo4.before;

/**
 * @author onesion
 * @version 1.0
 * @description 黑马品牌的安全门
 * @date 2025/3/15 17:43
 */
public class HeimaSafetyDoor implements SafetyDoor{

    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }

    @Override
    public void waterProof() {
        System.out.println("防水");
    }
}
