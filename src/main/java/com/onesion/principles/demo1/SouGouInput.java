package com.onesion.principles.demo1;

/**
 * @author onesion
 * @version 1.0
 * @description 搜狗输入法类
 * @date 2025/3/5 23:12
 */
public class SouGouInput {

    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display() {
        skin.display();
    }
}
