package com.mzx.builder;

import java.security.PrivateKey;

/**
 * @author ZhenXinMa
 * @date 2020/1/26 20:17
 */
public abstract class HouseBuilder {

    private House house = new House();

    public House getHouse(){
        return this.house;
    }

    public abstract void buildBase();

    public abstract void buildWalls();

    public abstract void roofed();

    /**
     *  建造好之后返回
     * @return
     */
    public House constructHouse(){
        return house;
    }



}
