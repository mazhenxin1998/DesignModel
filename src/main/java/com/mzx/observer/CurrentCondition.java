package com.mzx.observer;

import lombok.Data;

/**
 * @author ZhenXinMa
 * @date 2020/2/3 14:31
 *
 *      第三方接入方
 */
@Data
public class CurrentCondition {

    /***
     *   温度、气压、湿度
     */
    private int temperatrue;
    private int pressure;
    private int humidity;

    public void upDate(int temperatrue,int pressure,int humidity){
        this.temperatrue = temperatrue;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("今天的温度是:"+temperatrue);
        System.out.println("今天的气压是:"+pressure);
        System.out.println("今天的湿度是:"+humidity);
    }


}
