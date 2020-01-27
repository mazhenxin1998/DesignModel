package com.mzx.singleton;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.security.PrivateKey;

/**
 * @author ZhenXinMa
 * @date 2020/1/24 15:10
 *
 *      懒汉式：名义上的线程安全
 *          不能达到同步效果
 *          在实际开发中不能使用该方式
 *
 */
public class SingLeton_5 {
    public static void main(String[] args) {
        for(int i =0;i<1000;i++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    Single_5 s = Single_5.getInstance();
                    System.out.println(s.hashCode());
                }
            });
            thread.start();
        }
    }
}

class Single_5{

    private static Single_5 instance;

    /**
     * 对象锁
     */
    private static Object o = new Object();

    private Single_5(){}

    public static Single_5 getInstance(){

            if(instance == null){
                synchronized (o){
                    if(instance == null){
                        instance = new Single_5();
                    }
                }
            }
        return instance;
    }

    /**
     *  懒汉式单例   名义上的线程安全
     */
    public static Single_5 getinstance(){

        if(instance == null){
            synchronized (o){
                instance = new Single_5();
            }
        }
        return instance;
    }





}
