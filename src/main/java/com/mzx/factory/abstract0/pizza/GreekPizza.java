package com.mzx.factory.abstract0.pizza;

/**
 * @author ZhenXinMa
 * @date 2020/1/26 14:25
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("为"+getName()+"准备原材料");
    }
}
