package com.mzx.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ZhenXinMa
 * @date 2020/1/28 20:15
 */
public class WebSiteFactory {

    private Map<String,ConcreateWebSite> pool = new HashMap<>();

    public WebSite getWebSite(String type){

        if(!pool.containsKey(type)){
            pool.put(type,new ConcreateWebSite(type));
        }
        return pool.get(type);

    }

    public int getPoolCount(){
        return pool.size();
    }


}
