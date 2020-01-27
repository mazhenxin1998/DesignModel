package com.mzx.prototype.sheep.me;

import java.io.Serializable;

/**
 * @author ZhenXinMa
 * @date 2020/1/26 16:59
 */
public class SheepClone implements Serializable,Cloneable {

    private static final long serialVersionUID = 1L;
    private String name;
    private String classname;

    public SheepClone(String name,String classname){
        this.name = name;
        this.classname = classname;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
