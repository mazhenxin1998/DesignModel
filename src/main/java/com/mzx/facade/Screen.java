package com.mzx.facade;

/**
 * @author ZhenXinMa
 * @date 2020/1/28 17:17
 */
public class Screen {

    private static volatile Screen instance = null;

    private Screen(){}

    public static Screen getInstance(){

        if(instance == null){

            synchronized (Screen.class){
                if(instance == null){
                    instance = new Screen();
                }
            }

        }
        return instance;
    }

    public void up(){
        System.out.println(" screen up");
    }

    public void down(){
        System.out.println(" screen down ");
    }


}
