package com.mzx.flyweight;

/**
 * @author ZhenXinMa
 * @date 2020/1/28 20:27
 */
public class FlyWeightTest {
    public static void main(String[] args) {

        /**
         *  在-128···127之内Integer使用了享元模式 不重复创建对象
         */
        Integer x = Integer.valueOf(127);
        Integer y = new Integer(127);
        Integer z = Integer.valueOf(127);
        Integer w = new Integer(127);

        System.out.println(x.equals(y)); //true
        System.out.println(x == y);
        System.out.println(x == z); // true
        System.out.println(w == x);
        System.out.println(w == y);

        Integer x1 = Integer.valueOf(129);
        Integer y1 = Integer.valueOf(129);
        System.out.println("-----");
        System.out.println(x1 == y1);

    }
}
