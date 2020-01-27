package com.mzx.adapter.classadapter;

/**
 * @author ZhenXinMa
 * @date 2020/1/26 22:31
 *
 *
 *      类适配器注意事项:
 *          1. Java是单继承机制
 *
 *
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {

    @Override
    public int outPut5V() {
        int dir = outPut220V();
        dir = dir / 44;
        System.out.println("220V经过适配器后变为"+dir+"V");
        return dir;
    }
}
