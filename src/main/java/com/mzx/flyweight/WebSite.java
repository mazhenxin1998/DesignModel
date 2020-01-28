package com.mzx.flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author ZhenXinMa
 * @date 2020/1/28 20:10
 */
@Data
@AllArgsConstructor
public abstract class WebSite {

    private String type;

    public abstract void use(User user);

}