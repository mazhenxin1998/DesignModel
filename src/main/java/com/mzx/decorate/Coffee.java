package com.mzx.decorate;

/**
 * @author ZhenXinMa
 * @date 2020/1/27 21:34
 */
public class Coffee extends Drink{

    @Override
    public int cost() {
        return super.getPrice();
    }
}
