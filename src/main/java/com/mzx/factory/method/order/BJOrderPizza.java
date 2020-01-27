package com.mzx.factory.method.order;

import com.mzx.factory.method.pizza.CheesePizza;
import com.mzx.factory.method.pizza.GreekPizza;
import com.mzx.factory.method.pizza.Pizza;

/**
 * @author ZhenXinMa
 * @date 2020/1/26 13:34
 */
public class BJOrderPizza extends Order {

    @Override
    public Pizza createPizza(String type) {

        Pizza pizza = null;

        if(type.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("北京口味的CheesePizza");
        }else if (type.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("北京口味的GreekPizza");
        }

        return pizza;
    }
}
