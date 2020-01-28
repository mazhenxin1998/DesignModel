package com.mzx.groupmodel;

import lombok.Data;

/**
 * @author ZhenXinMa
 * @date 2020/1/28 15:33
 */
@Data
public class OriginComponent {

    public OriginComponent(String name,String description){
        this.name = name;
        this.description = description;
    }

    private String name;
    private String description;

    public void add(OriginComponent originComponent){
        // 无法操作的异常
        throw new UnsupportedOperationException();
    }

    public void remove(OriginComponent originComponent){
        throw new UnsupportedOperationException();
    }

    public void print(){
        // 默认实现
    }

}
