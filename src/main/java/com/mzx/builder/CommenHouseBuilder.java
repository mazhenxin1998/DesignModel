package com.mzx.builder;

/**
 * @author ZhenXinMa
 * @date 2020/1/26 20:21
 *
 *       普通房子
 *
 */
public class CommenHouseBuilder extends HouseBuilder {
    @Override
    public void buildBase() {
        System.out.println("普通房子打地基5米");
        super.getHouse().setHouseBase("普通房屋地基：5米");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子围墙5米");
        super.getHouse().setWalls("普通房屋围墙:5米");
    }

    @Override
    public void roofed() {
        System.out.println("封顶");
        super.getHouse().setRoof("普通房子封顶");
    }
}
