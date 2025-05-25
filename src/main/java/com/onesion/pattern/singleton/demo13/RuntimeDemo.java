package com.onesion.pattern.singleton.demo13;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author onesion
 * @version 1.0
 * @description Runtime类就是使用饿汉式单例模式（静态变量）
 * @date 2025/5/25 13:27
 */
public class RuntimeDemo {

    public static void main(String[] args) throws IOException {

        // 获取Runtime类的对象
        Runtime runtime = Runtime.getRuntime();

        // 调用Runtime的方法 【exec方法，参数要的是一个命令】
        Process process = runtime.exec("ifconfig");

        // 调用process对象的获取输入流的方法
        InputStream inputStream = process.getInputStream();
        byte[] arr = new byte[1024 * 1024 * 100];

        // 读取数据
        int len = inputStream.read(arr);  // 返回读到的字节的个数

        // 将字节数组转换为字符串输出到控制台
        System.out.println(new String(arr, 0, len, "GBK"));
    }
}
