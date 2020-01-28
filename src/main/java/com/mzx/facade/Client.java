package com.mzx.facade;

/**
 * @author ZhenXinMa
 * @date 2020/1/28 17:31
 *
 *      模拟客户端
 */
public class Client {
    public static void main(String[] args) {

        HomeFacade homeFacade = new HomeFacade();
        homeFacade.ready();
        homeFacade.play();
        homeFacade.pause();
        homeFacade.end();

    }
}
