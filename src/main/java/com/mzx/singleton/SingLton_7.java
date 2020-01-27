package com.mzx.singleton;

/**
 * @author ZhenXinMa
 * @date 2020/1/24 15:45
 */
public class SingLton_7 {
    public static void main(String[] args) {
        for(int i = 0;i<1000;i++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    Single_7 single_7 = Single_7.getInstacne();
                    System.out.println(single_7.hashCode());
                }
            });
            thread.start();
        }
    }
}

/**
 *  静态内部类实现单例模式
 */
class Single_7{

    private Single_7(){}

    /**
     *  静态内部类：
     *      特点
     *          1. 静态内部类不会在Single_7当前类加载的时候进行加载，而是在需要改类的时候采去类装载静态内部类
     *          2. 类的静态属性只会在类第一次类加载的时候初始化，这样保证了线程安全性
     *          3. 避免了线程安全，利用静态内部类来实现延迟加载，效率高
     */
    static class Single_Static{
        private static final Single_7 instance = new Single_7();
    }

    public static synchronized Single_7 getInstacne(){
        return Single_Static.instance;
    }
}
