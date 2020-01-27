package com.mzx.factory.abstract0.pizza;

/**
 * @author ZhenXinMa
 * @date 2020/1/26 14:26
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("为"+getName()+"准备原材料");
    }
}
