package com.onesion.principles.demo4.after;

/**
 * @author onesion
 * @version 1.0
 * @description 黑马品牌的安全门
 * @date 2025/5/21 21:23
 */
public class HeimaSafetyDoor implements AntiTheft, Fireproof, Waterproof{
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }

    @Override
    public void waterproof() {
        System.out.println("防水");
    }
}
