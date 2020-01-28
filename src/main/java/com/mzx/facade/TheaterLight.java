package com.mzx.facade;

/**
 * @author ZhenXinMa
 * @date 2020/1/28 17:22
 *
 *       灯光
 *
 */
public class TheaterLight {

    private static volatile TheaterLight instance = null;

    private TheaterLight(){}

    public static TheaterLight getInstance(){

        if(instance == null){

            synchronized(TheaterLight.class){
                if(instance == null){
                    instance = new TheaterLight();
                }
            }
        }
        return instance;
    }

    public void on(){
        System.out.println(" theaterLight on");
    }

    public void off(){
        System.out.println(" theaterLight off");
    }

    public void dim (){
        System.out.println("  light dim ..");
    }

    public void bright(){
        System.out.println(" light bright");
    }


}
