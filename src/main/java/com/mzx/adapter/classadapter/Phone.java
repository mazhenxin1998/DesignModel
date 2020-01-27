package com.mzx.adapter.classadapter;

/**
 * @author ZhenXinMa
 * @date 2020/1/26 22:33
 */
public class Phone {

    private Voltage5V v;

    public Phone(Voltage5V v){
        this.v = v;
    }

    public void charge(){

        if(v.outPut5V() == 5){
            System.out.println("开始充电");
        }else{
            System.out.println("不能充电，等待连接适配器");
        }

    }

}
