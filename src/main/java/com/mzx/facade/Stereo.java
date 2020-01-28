package com.mzx.facade;

/**
 * @author ZhenXinMa
 * @date 2020/1/28 17:19
 *
 *      立体声
 *
 */
public class Stereo {

    private static volatile Stereo instance = null;

    private Stereo(){}

    public static Stereo getInstance(){

        if(instance == null){

            synchronized (Stereo.class){
                if(instance == null){
                    instance = new Stereo();
                }
            }

        }
        return instance;
    }

    public void on(){
        System.out.println(" stereo on");
    }

    public void off(){
        System.out.println(" stereo off");
    }

    public void up(){
        System.out.println(" stereo up");
    }

}
