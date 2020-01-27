package com.mzx.builder;

/**
 * @author ZhenXinMa
 * @date 2020/1/26 20:23
 *
 *      指挥者 这里去指定建造流程   控制流程
 *
 */
public class HouseDirector {

    private HouseBuilder builder = null;

    public HouseDirector(HouseBuilder builder){
        this.builder = builder;
    }

    public void setHouseBuilder(HouseBuilder builder){
        this.builder = builder;
    }

    public House build(){
        builder.buildBase();
        builder.buildWalls();
        builder.roofed();
        return builder.constructHouse();
    }

}
