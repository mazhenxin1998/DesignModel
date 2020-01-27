package com.mzx.prototype.sheep.sheep;

import lombok.Data;

/**
 * @author ZhenXinMa
 * @date 2020/1/26 17:09
 */

@Data
public class Sheep implements Cloneable {

    private int age;

    public Sheep(int age){
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep = (Sheep) super.clone();
        return sheep;
    }
}
