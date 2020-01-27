package com.mzx.adapter.objectadapter;

/**
 * @author ZhenXinMa
 * @date 2020/1/27 13:46
 */
public class Phone {

    public void charge(VolTageAdapter v){
        int drc = v.outPut5V();
        if(drc == 5){
            System.out.println("电压适配正确，开始充电");
        }else{
            System.out.println("充电失败");
        }
    }

}
