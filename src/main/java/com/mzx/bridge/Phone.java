package com.mzx.bridge;

import lombok.AllArgsConstructor;

/**
 * @author ZhenXinMa
 * @date 2020/1/27 20:11
 *
 *
 *       充当桥梁
 *
 */
@AllArgsConstructor
public class Phone {

    private Brade brade;

    public void call(){
        this.brade.call();
    }

    public void open(){
        this.brade.open();
    }

    public void close(){
        this.brade.close();
    }


}
