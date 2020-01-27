package com.mzx.singleton;

/**
 * @author ZhenXinMa
 * @date 2020/1/24 14:54
 *
 *
 *      懒汉式单例：线程不安全
 *      优点：
 *          1. 起到了LazyLoading效果，但是只能在单线程下使用
 *          2. 如果在多线程下，一旦有一个线程进入if判断语句，但是就被CPU时间片切出去
 *             而另一个线程则已经初始化完毕该对象实例，一旦再次轮到上个线程，那么就会
 *             创建多个实例，不再是单例模式
 *
 *      缺点：
 *          1. 在实际开发中，不建议使用
 *
 */
public class SingLeton_3 {
    public static void main(String[] args) {
        for(int i =0;i<100;i++){
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    Single s = Single.getInstance();
                    System.out.println(s.hashCode());
                }
            });
            t.start();
        }
    }
}

/**
 *   懒汉式单例：
 *   步骤：
 *      1. 构造方法私有
 *      2. 当前对象的静态常量实例
 *      3. 公开Get方法
 */
class Single{

    private Single(){}

    private static Single instance;

    public static Single getInstance(){
        if(instance == null){
            instance = new Single();
        }
        return instance;
    }


}
