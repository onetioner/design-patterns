package com.onesion.pattern.singleton.demo9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author onesion
 * @version 1.0
 * @description 测试类
 *      测试使用 序列化和反序列化 破坏单例模式
 *
 *      桌面路径：/Users/onesion/Desktop/a.txt
 * @date 2025/5/24 14:19
 */
public class Client {

    public static void main(String[] args) throws Exception {
        // 往文件中写对象
        // writeObject2File();

        //从文件中读取对象
        Singleton instance = readObjectFromFile();
        Singleton instance1 = readObjectFromFile();

        //判断两个反序列化后的对象是否是同一个对象
        System.out.println(instance == instance1);  // false

    }

    // 从文件中读数据（对象）
    public static Singleton readObjectFromFile() throws Exception {
        // 1. 创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/onesion/Desktop/a.txt"));

        // 2. 读取对象
        Singleton instance = (Singleton) ois.readObject();

        // 3. 释放资源
        ois.close();

        return instance;


    }

    // 向文件中写数据（对象）
    public static void writeObject2File() throws Exception {
        // 1. 获取Singleton对象
        Singleton instance = Singleton.getInstance();

        // 2. 创建对象输出流对象
        ObjectOutputStream oos  = new ObjectOutputStream(new FileOutputStream("/Users/onesion/Desktop/a.txt"));

        // 3. 写对象
        oos.writeObject(instance);

        // 4. 释放资源
        oos.close();
    }

}
