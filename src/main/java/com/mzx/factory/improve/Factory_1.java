package com.mzx.factory.improve;

import javafx.beans.binding.StringExpression;

import java.awt.font.LineBreakMeasurer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ZhenXinMa
 * @date 2020/1/26 12:47
 */
public class Factory_1 {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza(new SimpleFactory());
    }
}

abstract class Pizza{

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public abstract void prepare();

    public void bake(){
        System.out.println(name+"  bake");
    }

    public void box(){
        System.out.println(name+"  box");
    }

    public void cut(){
        System.out.println(name+"   cut");
    }

}

// 希腊披萨
class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("为Greek披萨准备原材料");
    }
}
// 奶酪披萨
class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("为CheesePizza准备原材料");
    }
}

/**
 *    Pizza工厂模式
 *    将初始化Pizza的代码根据情况让Factory创建
 *    如果需要再次增加Pizza的实例，那么就符合开闭原则，在使用方不用修改，只修改SimpleFactory就可以
 */
class SimpleFactory{

    public Pizza getPizza(String type){

        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("   CheesePizza  ");
        }else if(type.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("  GreekPizza  ");
        }
        return pizza;
    }
}

class OrderPizza {

    private SimpleFactory simpleFactory = null;
    private Pizza pizza = null;
    private String type = "";

    public OrderPizza(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
        while (true) {
            type = getType();
            pizza = this.simpleFactory.getPizza(type);
            if (pizza != null) {
                System.out.println("使用简单工厂模式来实现开闭原则");
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
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