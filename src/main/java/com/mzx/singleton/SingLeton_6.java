package com.mzx.singleton;

/**
 * @author ZhenXinMa
 * @date 2020/1/24 15:25
 *
 *  DCL单例模式：
 *      1. DCL单例模式是多线程开发中经常用到的，即实现了懒加载的效果，也保证线程同步问题
 *      2. 效率高
 *
 *      在多线程开发中建议使用该模式
 *
 */
public class SingLeton_6 {
    public static void main(String[] args) {
        for(int i =0;i<1000;i++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    Single_6 single_6 = Single_6.getInstance();
                    System.out.println(single_6.hashCode());
                }
            });
            thread.start();
        }
    }
}

/**
 *  DCL单例模式：
 */
class Single_6{

    private volatile static Single_6 instance;

    private Single_6(){}

    public static Single_6 getInstance(){

        if(instance == null){
            synchronized (Single_6.class){
                if(instance == null){
                    instance = new Single_6();
                }
            }
        }
        return instance;

    }
}


