package com.mzx.singleton;

/**
 * @author ZhenXinMa
 * @date 2020/1/24 15:04
 *
 *      单例：线程安全
 *      优点：
 *          1.解决了线程同步问题
 *      缺点：
 *          1. 效率太低，每个线程要获得该实例的时候，执行Get方法都要进行同步，而我们只需要实例化一次
 *             return 多次
 *
 */
public class SingLeton_4 {
    public static void main(String[] args) {
        for(int i =0;i<100;i++){
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    Single_4 single_4 = Single_4.getInstance();
                    System.out.println(single_4.hashCode());
                }
            });
            t.start();
        }
    }
}

/**
 *   懒汉式单例：线程安全
 *   步骤：
 *      1. 构造方法私有
 *      2. 当前对象的静态常量实例
 *      3. 公开Get方法
 */
class Single_4{

    private Single_4(){}

    private static Single_4 instance;

    public static synchronized Single_4 getInstance(){
        if(instance == null){
            instance = new Single_4();
        }
        return instance;
    }


}
