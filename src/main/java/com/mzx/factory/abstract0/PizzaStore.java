package com.mzx.factory.abstract0;

import com.mzx.factory.abstract0.factory.BJFactory;
import com.mzx.factory.abstract0.factory.LDFactory;
import com.mzx.factory.abstract0.order.OrderPizza;

/**
 * @author ZhenXinMa
 * @date 2020/1/26 14:37
 */
public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza(new LDFactory());
    }
}
