package com.mzx.bridge;

/**
 * @author ZhenXinMa
 * @date 2020/1/27 20:09
 */
public class HuaWei implements Brade {
    @Override
    public void call() {
        System.out.println("华为手机在打电话");
    }

    @Override
    public void open() {
        System.out.println("打开华为手机了");
    }

    @Override
    public void close() {
        System.out.println("关闭华为手机了");
    }
}
