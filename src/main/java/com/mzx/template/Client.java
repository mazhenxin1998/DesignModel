package com.mzx.template;

/**
 * @author ZhenXinMa
 * @date 2020/1/30 17:03
 */
public class Client {
    public static void main(String[] args) {

        System.out.println("---开始制作红豆豆浆");
        SoyaMilk readBean = new ReadBeanSoyaMilk();
        readBean.make();

        System.out.println("---开始制作花生豆浆");
        SoyaMilk peanut = new PeanutSoyaMilk();
        peanut.make();

    }
}
