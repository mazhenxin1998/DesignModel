package com.mzx.extendstest;

/**
 * @author ZhenXinMa
 * @date 2020/1/28 15:06
 */
public class Client {
    public static void main(String[] args) {
        ExtendsTest extendsTest = new ExtendsTest2();
        extendsTest.setName("张三");
        System.out.println(extendsTest.getName());
    }
}
