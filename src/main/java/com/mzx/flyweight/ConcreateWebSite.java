package com.mzx.flyweight;

import java.lang.reflect.Type;

/**
 * @author ZhenXinMa
 * @date 2020/1/28 20:12
 */
public class ConcreateWebSite extends WebSite {


    public ConcreateWebSite(String type) {
        super(type);
    }

    @Override
    public void use(User user) {
        System.out.println("当前创建网站的形式为:"+ super.getType()+"使用者:"+user.getName());
    }
}
