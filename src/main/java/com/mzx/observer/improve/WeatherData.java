package com.mzx.observer.improve;

import com.mzx.observer.CurrentCondition;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhenXinMa
 * @date 2020/2/3 14:58
 */
@Data
public class WeatherData implements Subject {

    private int temperatrue;
    private int pressure;
    private int humidity;

    /**
     *  第三方接入
     */
    private List<Observer> observers ;

    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    public void setWeatherData(int temperatrue,int pressure,int humidity){
        this.temperatrue = temperatrue;
        this.pressure = pressure;
        this.humidity = humidity;
        upData();
    }

    public void upData(){
        notifyObservers();
    }


    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(observers.contains(o)){
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.upData(this.temperatrue,this.pressure,this.humidity);
        }
    }
}
