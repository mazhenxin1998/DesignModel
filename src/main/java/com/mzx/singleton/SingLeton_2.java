package com.mzx.singleton;

/**
 * @author ZhenXinMa
 * @date 2020/1/23 23:02
 *
 *   静态代码块式 懒汉式
 *
 *      优点：
 *          1. 在类装在的时候完成实例化,避免了线程同步问题
 *      缺点：
 *          1. 在类装载的时候完成实例化，没有达到LazyLoading的效果，如果从开始就没有使用该实例，将会造成内存浪费
 *
 *       这种方式可用，可能造成内存浪费
 *
 */
public class SingLeton_2 {
    public static void main(String[] args) {
        SingLe s1 = SingLe.getInstance();
        SingLe s2 = SingLe.getInstance();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}

/**
 *   静态代码块 懒汉式
 *
 *   静态代码块和静态常量 都是在类装在的时候完成初始化
 *
 */
class SingLe{

    // 私有构造方法
    private SingLe(){}

    private static SingLe instance;

    static{
        instance = new SingLe();
    }

    public static SingLe getInstance(){
        return instance;
    }

}
