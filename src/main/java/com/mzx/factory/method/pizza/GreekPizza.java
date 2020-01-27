package com.mzx.factory.method.pizza;

/**
 * @author ZhenXinMa
 * @date 2020/1/26 13:30
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("为"+getName()+"准备原材料");
    }
}
