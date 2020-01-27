package com.mzx.adapter.objectadapter;

/**
 * @author ZhenXinMa
 * @date 2020/1/27 13:47
 */
public class Client {

    public static void main(String[] args) {

        Phone phone = new Phone();
        System.out.println("适配器模式");
        phone.charge(new VolTageAdapter(new VolTage220Vimpl()));

    }

}
