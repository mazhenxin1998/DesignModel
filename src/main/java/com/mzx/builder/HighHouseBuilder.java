package com.mzx.builder;

/**
 * @author ZhenXinMa
 * @date 2020/1/26 21:33
 */
public class HighHouseBuilder extends HouseBuilder {
    @Override
    public void buildBase() {
        System.out.println("高建筑建地基10米");
        getHouse().setHouseBase("高层建筑地基10米");
    }

    @Override
    public void buildWalls() {
        System.out.println("高建筑建造围墙10米");
        getHouse().setWalls("高层建筑围墙：10米");
    }

    @Override
    public void roofed() {
        System.out.println("高建筑封顶");
        getHouse().setRoof("高层建筑封顶");
    }
}
