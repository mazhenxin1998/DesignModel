package com.mzx.facade;

/**
 * @author ZhenXinMa
 * @date 2020/1/28 17:05
 */
public class DvdPlay {

    private static volatile  DvdPlay instance = null;

    private DvdPlay(){}

    public static DvdPlay getInstance(){

        if(instance == null){
            synchronized (DvdPlay.class){
                if(instance == null){
                    instance = new DvdPlay();
                }
            }
        }

        return instance;
    }

    public void on(){
        System.out.println(" dvd on");
    }

    public void off(){
        System.out.println(" dvd off");
    }

    public void play(){
        System.out.println("  dvd play");
    }

    public void pause(){
        System.out.println(" dvd pause");
    }


}
