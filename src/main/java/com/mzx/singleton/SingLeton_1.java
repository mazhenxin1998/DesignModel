package com.mzx.singleton;

/**
 * @author ZhenXinMa
 * @date 2020/1/23 22:40
 *
 *
 *      静态常量 饿汉式优缺点：
 *          优点：
 *              1. 在类装在的时候完成实例化,避免了线程同步问题
 *          缺点：
 *              1. 在类装载的时候完成实例化，没有达到LazyLoading的效果，如果从开始就没有使用该实例，将会造成内存浪费
 *
 *
 *          基于ClassLoader机制避免了线程同步问题，不同实例在类装在的时候就完成实例化，但是在单例模式中，大多数都是调用getInstance
 *          方法，但是导致类装载的原因有很多，因此不能确定有其他方式导致类装载，这时候初始化实例没有达到LazyLoading效果
 *
 *          这种单例模式可用，可能造成内幕才能浪费
 *
 */
public class SingLeton_1 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }
}

/**
 *  创建第一种饿汉式步骤：
 *      1. 将构造方法私有化
 *      2. 在该类提供一个该类的实例  final
 *      3. 提供一个静态方法，返回该实例
 */
class Singleton{

    private Singleton(){}

    private final static  Singleton instance = new Singleton();

    public static Singleton getSingleton(){
        return instance;
    }
}
