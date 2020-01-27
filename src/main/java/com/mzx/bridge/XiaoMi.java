package com.mzx.bridge;

/**
 * @author ZhenXinMa
 * @date 2020/1/27 20:09
 */
public class XiaoMi implements Brade {
    @Override
    public void call() {
        System.out.println("小米手机在打电话");
    }

    @Override
    public void open() {
        System.out.println("打开小米手机了");
    }

    @Override
    public void close() {
        System.out.println("关闭小米手机");
    }
}
