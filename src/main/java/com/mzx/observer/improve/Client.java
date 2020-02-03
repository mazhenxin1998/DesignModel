package com.mzx.observer.improve;

/**
 * @author ZhenXinMa
 * @date 2020/2/3 15:03
 */
public class Client {
    public static void main(String[] args) {

        Observer o1 = new CurrentCondition();

        WeatherData weatherData = new WeatherData();

        weatherData.registerObserver(o1);

        weatherData.setWeatherData(100,20,30);

        //weatherData.upData();


    }
}
