package com.mzx.observer;

import lombok.Data;

/**
 * @author ZhenXinMa
 * @date 2020/2/3 14:34
 */
@Data
public class WeatherData {

    private int temperatrue;
    private int pressure;
    private int humidity;

    /**
     *  第三方接入
     */
    private CurrentCondition currentCondition;

    public WeatherData(CurrentCondition currentCondition){
        this.currentCondition = currentCondition;
    }

    public void setWeatherData(int temperatrue,int pressure,int humidity){
        this.temperatrue = temperatrue;
        this.pressure = pressure;
        this.humidity = humidity;
        upData();
    }

    public void upData(){
        currentCondition.upDate(getTemperatrue(),getPressure(),getHumidity());
    }

}
