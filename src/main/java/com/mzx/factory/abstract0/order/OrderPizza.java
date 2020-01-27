package com.mzx.factory.abstract0.order;

import com.mzx.factory.abstract0.factory.PizzaFactory;
import com.mzx.factory.abstract0.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ZhenXinMa
 * @date 2020/1/26 14:30
 *
 *       使用方
 *
 */
public class OrderPizza {

    private PizzaFactory factory;

    public OrderPizza(PizzaFactory factory){
        this.setFactory(factory);
    }

    private void setFactory(PizzaFactory factory){
        this.factory = factory;
        String type = "" ;
        Pizza pizza = null;

        while(true){
            type = getType();
            pizza = factory.createPizza(type);
            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("订购Pizza失败");
                break;
            }
        }
    }


    private String getType(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入订购披萨的类型");
        String str = "";
        try {
            str = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }


}
