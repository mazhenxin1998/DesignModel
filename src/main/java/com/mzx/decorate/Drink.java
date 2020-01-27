package com.mzx.decorate;

import lombok.Data;
import lombok.ToString;

/**
 * @author ZhenXinMa
 * @date 2020/1/27 21:33
 */
@Data
@ToString
public abstract class Drink {

    private String message;
    private int price = 0;

    public abstract int cost();

}
