package com.mzx.prototype.sheep.improve;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ZhenXinMa
 * @date 2020/1/26 16:18
 */
@Data
public class SheepClone implements Cloneable , Serializable {

    private static final long serialVersionUID = 1L;

    private String clonename  ;

    private String cloneclass;

    public SheepClone(String clonename,String cloneclass){
        this.clonename = clonename;
        this.cloneclass = cloneclass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
