package com.mzx.builder;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @author ZhenXinMa
 * @date 2020/1/26 20:48
 */
public class Client {
    public static void main(String[] args) {

        System.out.println("建筑普通房屋");
        CommenHouseBuilder commenHouseBuilder = new CommenHouseBuilder();
        HouseDirector director = new HouseDirector(commenHouseBuilder);
        House build = director.build();
        System.out.println("输出建造好的普通房屋信息:"+build);


        System.out.println("建筑高层建筑");
        HighHouseBuilder highHouseBuilder = new HighHouseBuilder();
        HouseDirector director1 = new HouseDirector(highHouseBuilder);
        House build1 = director1.build();
        System.out.println("输出建造好的高层建筑信息："+build1);

    }
}
