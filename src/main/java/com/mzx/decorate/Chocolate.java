package com.mzx.decorate;

/**
 * @author ZhenXinMa
 * @date 2020/1/27 21:46
 */
public class Chocolate extends Decorater {

    public Chocolate(Drink drink) {
        super(drink);
        super.setMessage("  巧克力调料");
        super.setPrice(1);
    }
}
