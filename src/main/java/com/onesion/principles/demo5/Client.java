package com.onesion.principles.demo5;

/**
 * @author onesion
 * @version 1.0
 * @description 测试类
 * @date 2025/5/22 22:43
 */
public class Client {
    public static void main(String[] args) {
        // 创建经纪人类
        Agent agent = new Agent();

        // 创建明星对象并设置
        Star star = new Star("林青霞");
        agent.setStar(star);

        // 创建粉丝对象并设置
        Fans fans = new Fans("李四");
        agent.setFans(fans);

        // 创建媒体公司对象并设置
        Company company = new Company("黑马媒体公司");
        agent.setCompany(company);

        agent.meeting();  // 和粉丝见面
        agent.business();  // 和媒体公司洽谈业务
    }
}
