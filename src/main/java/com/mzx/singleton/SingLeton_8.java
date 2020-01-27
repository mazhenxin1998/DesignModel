package com.mzx.singleton;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @author ZhenXinMa
 * @date 2020/1/24 15:56
 *
 *
 *    枚举实现单例：
 *      优点：
 *          1. 避免线程同步问题
 *          2. 避免反序列化的时候创建新的对象
 *          3. 提倡使用
 */
public class SingLeton_8 {
    public static void main(String[] args) {
        for(int i = 0;i<1000;i++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    Single_8 single_8 = Single_8.INSTANCE;
                    System.out.println(single_8.hashCode());
                }
            });
            thread.start();
        }
    }
}

/**
 *  枚举实现单例
 *
 */
enum Single_8{

    INSTANCE;
    public void say(){
        System.out.println("OK");
    }

}
