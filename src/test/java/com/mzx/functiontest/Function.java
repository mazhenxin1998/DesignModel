package com.mzx.functiontest;

/**
 * @author ZhenXinMa
 * @date 2020/2/1 17:17
 */


public interface Function {
//    int add(int i,int j);

    default  void select(){
        System.out.println("接口里面实现了");
    }
}
