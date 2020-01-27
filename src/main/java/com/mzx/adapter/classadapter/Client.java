package com.mzx.adapter.classadapter;

/**
 * @author ZhenXinMa
 * @date 2020/1/26 22:35
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone(new VoltageAdapter());
        phone.charge();
    }
}
