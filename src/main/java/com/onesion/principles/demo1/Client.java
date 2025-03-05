package com.onesion.principles.demo1;

/**
 * @author onesion
 * @version 1.0
 * @description 测试类
 * @date 2025/3/5 23:15
 */
public class Client {
    public static void main(String[] args) {
        // 1. 创建搜狗输入法对象
        SouGouInput input = new SouGouInput();

        // 2. 创建皮肤对象
        // DefaultSpecificSkin skin = new DefaultSpecificSkin();  // 默认皮肤
        HeimaSpecificSkin skin = new HeimaSpecificSkin();  // 黑马皮肤

        /*
            开闭原则：对扩展开放，对修改关闭
            如果再需要添加一个皮肤，例如传智皮肤，只需要再增加一个传智皮肤类，继承皮肤抽象类即可
         */

        // 3. 将皮肤设置到输入法中
        input.setSkin(skin);

        // 4. 显示皮肤
        input.display();
    }
}
