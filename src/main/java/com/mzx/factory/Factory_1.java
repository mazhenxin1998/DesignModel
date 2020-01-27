package com.mzx.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ZhenXinMa
 * @date 2020/1/25 13:44
 *
 *
 *      未使用工厂模式
 *      违反了OCP原则： 既对扩展开放，对修改关闭  ---开闭原则
 *
 */

public class Factory_1 {
    // 模拟客户端
    public static void main(String[] args) {
        new Order();
    }
}


abstract class Pizza{

    private String name;

    //准备材料
    public abstract void prepare();

    //烘烤
    public void bake(){
        System.out.println(name+"bake");
    }

    public void cut(){
        System.out.println(name+"cut");
    }

    // 打包
    public void box(){
        System.out.println(name+"box");
    }

    public void setName(String name){
        this.name = name;
    }


}

// 希腊披萨
class GreekPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("为Greek披萨准备原材料");
    }
}
// 奶酪披萨
class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("为CheesePizza准备原材料");
    }
}

//  在这里使用Pizza 对修改关闭 如果该程序满足OCP原则， 那么新增加Pizza的时候，这里不应该修改
class Order {

    public Order(){
        Pizza pizza = null;
        String type = "";
        do {
            type = getType();
            if(type.equals("Greek")){
                //希腊披萨
                pizza = new GreekPizza();
                pizza.setName(type);
            }else if(type.equals("Cheese")){
                pizza = new CheesePizza();
                pizza.setName(type);
            }else{
                break;
            }

            // 输出披萨的制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
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


