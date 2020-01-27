package com.mzx.decorate;

/**
 * @author ZhenXinMa
 * @date 2020/1/27 21:47
 */
public class Client {

    public static void main(String[] args) {

        // 10元 牛奶2 元 巧克力1元
        Drink order = new LongBlack();
        System.out.println(order.getMessage()+order.cost());

        order = new Milk(order);
        System.out.println(order.getMessage()+"添加了一份牛奶之后"+order.cost());

        order = new Chocolate(order);
        System.out.println(order.getMessage()+"添加了一份牛奶之后 添加一份巧克力之后"+order.cost());

        order = new Chocolate(order);
        System.out.println("添加了两份巧克力 一份牛奶之后价格："+order.cost());

    }

}
