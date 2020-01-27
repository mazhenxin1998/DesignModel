package com.mzx.prototype.sheep.sheep;

/**
 * @author ZhenXinMa
 * @date 2020/1/26 17:10
 */
public class Client {
    public static void main(String[] args) {
        Sheep s1 = new Sheep(1);
        try {

            Sheep s2 = (Sheep) s1.clone();
            System.out.println(s1.hashCode());
            System.out.println(s2.hashCode());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
