package com.mzx.decorate;

import lombok.Data;
import lombok.ToString;

/**
 * @author ZhenXinMa
 * @date 2020/1/27 21:39
 */
@Data
@ToString
public class Decorater extends Drink{

    /**
     *  当前调料中咖啡的引用
     */
    private Drink drink;

    public Decorater(Drink drink){
        this.drink = drink;
    }


    /**
     *  返回价钱： 当前调料的价格 和  咖啡的价格
     * @return
     */
    @Override
    public int cost() {
        return super.getPrice()+drink.cost();
    }

    @Override
    public String getMessage() {
        return super.getMessage() +"" +super.getPrice()+"&&"+ drink.getMessage();
    }
}
