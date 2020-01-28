package com.mzx.facade;

/**
 * @author ZhenXinMa
 * @date 2020/1/28 17:13
 *
 *      模拟投影仪
 */
public class Projector {

    private static volatile Projector instance = null;

    private Projector(){}

    public static Projector getInstance(){

        if(instance == null){

            synchronized (Projector.class){
                if(instance == null){
                    instance = new Projector();
                }
            }
        }
        return instance;
    }

    public void on(){
        System.out.println(" projector on");
    }

    public void off(){
        System.out.println(" projector off");
    }

    public void focus(){
        System.out.println(" projector focus");
    }

}
