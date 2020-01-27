package com.mzx.adapter.interfaceadapter;

/**
 * @author ZhenXinMa
 * @date 2020/1/27 17:26
 */
public class Client {
    public static void main(String[] args) {

        interfaceAdapter adapter = new interfaceAdapter(){

            @Override
            public void f1() {
                System.out.println("使用了接口适配器中的f1方法");
            }
        };

        adapter.f1();

    }
}
