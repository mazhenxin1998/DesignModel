package com.mzx.prototype.sheep.improve;

/**
 * @author ZhenXinMa
 * @date 2020/1/26 16:34
 */
public class Test2 {
    public static void main(String[] args) {
        Sheep s1 = new Sheep();
        s1.setName("小牛");
        s1.setSheepClone(new SheepClone("大牛","大牛类"));


        Sheep s2 = (Sheep) s1.sheepClone();
        System.out.println(s1.sheepClone.hashCode());
        System.out.println(s2.sheepClone.hashCode());

    }
}
