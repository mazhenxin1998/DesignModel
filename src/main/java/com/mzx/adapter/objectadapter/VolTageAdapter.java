package com.mzx.adapter.objectadapter;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.naming.ldap.SortResponseControl;

/**
 * @author ZhenXinMa
 * @date 2020/1/27 13:42
 */
@AllArgsConstructor
@Data
public class VolTageAdapter implements Voltage5V {

    private Voltage220V v;

    @Override
    public int outPut5V() {
        int drc = 0;
        if(v != null){
            System.out.println("适配器开始适配");
            int src = v.outPut220V();
            drc = src /44;
            System.out.println("适配后的电压为:"+drc);
        }
        return drc;
    }
}
