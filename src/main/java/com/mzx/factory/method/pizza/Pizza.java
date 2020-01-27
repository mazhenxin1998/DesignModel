package com.mzx.factory.method.pizza;

/**
 * @author ZhenXinMa
 * @date 2020/1/26 13:29
 */
public abstract class Pizza {

    private String name;

    public String getName(){
        return this.name;
    }

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
