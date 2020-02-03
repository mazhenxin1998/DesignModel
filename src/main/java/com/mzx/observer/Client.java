package com.mzx.observer;

/**
 * @author ZhenXinMa
 * @date 2020/2/3 14:37
 *
 *       当增加新的第三方的时候 不符合开闭原则
 */
public class Client {
    public static void main(String[] args) {
        CurrentCondition currentCondition = new CurrentCondition();

        WeatherData weatherData = new WeatherData(currentCondition);

        weatherData.setWeatherData(10,20,30);
        System.out.println("天气修改之后");
        weatherData.setWeatherData(30,40,50);
    }
}
