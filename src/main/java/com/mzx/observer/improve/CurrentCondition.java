package com.mzx.observer.improve;

import lombok.Data;

/**
 * @author ZhenXinMa
 * @date 2020/2/3 15:01
 */
@Data
public class CurrentCondition implements Observer {

    private int temperatrue;
    private int pressure;
    private int humidity;

    public void display(){
        System.out.println("今天的温度是:"+temperatrue);
        System.out.println("今天的气压是:"+pressure);
        System.out.println("今天的湿度是:"+humidity);
    }

    @Override
    public void upData(int temperatrue, int pressure, int humidity) {
        this.temperatrue = temperatrue;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }
}
