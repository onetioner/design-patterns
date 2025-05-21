package com.onesion.principles.demo4.after;

/**
 * @author onesion
 * @version 1.0
 * @description 传智品牌的安全门
 * @date 2025/5/21 21:25
 */
public class ItcastSafetyDoor implements AntiTheft, Fireproof{
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }
}
