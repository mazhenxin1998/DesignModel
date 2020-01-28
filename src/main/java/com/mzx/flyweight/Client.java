package com.mzx.flyweight;

/**
 * @author ZhenXinMa
 * @date 2020/1/28 20:17
 */
public class Client {
    public static void main(String[] args) {

        WebSiteFactory factory = new WebSiteFactory();

        WebSite webSite = factory.getWebSite("新闻");
        webSite.use(new User("张三"));

        WebSite webSite1 = factory.getWebSite("新闻");
        webSite.use(new User("李四"));

        WebSite webSite2 = factory.getWebSite("体育");
        webSite2.use(new User("王五"));


        System.out.println("目前pool中有"+factory.getPoolCount()+"WebSite");

    }
}
