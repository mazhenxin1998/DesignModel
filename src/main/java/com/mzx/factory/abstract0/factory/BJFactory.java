package com.mzx.factory.abstract0.factory;

import com.mzx.factory.abstract0.pizza.CheesePizza;
import com.mzx.factory.abstract0.pizza.GreekPizza;
import com.mzx.factory.abstract0.pizza.Pizza;

/**
 * @author ZhenXinMa
 * @date 2020/1/26 14:27
 */
public class BJFactory implements PizzaFactory {
    @Override
    public Pizza createPizza(String type) {

        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("北京口味的CheesePizza");
        }else if(type.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("北京口味的GreekPizza");
        }
        return pizza;
    }
}
