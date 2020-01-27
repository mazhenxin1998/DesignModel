package com.mzx.adapter.objectadapter;


/**
 * @author ZhenXinMa
 * @date 2020/1/27 13:40
 */
public class VolTage220Vimpl implements Voltage220V {

    @Override
    public int outPut220V() {
        int ssrc = 220 ;
        System.out.println("当前电压为："+ssrc);
        return ssrc;
    }
}
