package com.mzx.factory.method.order;

import com.mzx.factory.method.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ZhenXinMa
 * @date 2020/1/26 13:31
 */
public abstract class Order {

    public abstract Pizza createPizza(String type);

    private String type = "";

    public Order(){
        while(true){
            type = getType();
            // 由子类创建具体的Pizza实现类
            Pizza pizza = createPizza(type);
            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("订购Pizza失败，退出");
                break;
            }

        }
    }

    private String getType() {
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
