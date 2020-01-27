package com.mzx.factory.abstract0.factory;

import com.mzx.factory.abstract0.pizza.Pizza;

/**
 * @author ZhenXinMa
 * @date 2020/1/26 14:27
 */
public interface PizzaFactory {

    Pizza createPizza(String type);

}
