package com.mzx.prototype.sheep.me;

/**
 * @author ZhenXinMa
 * @date 2020/1/26 17:06
 */
public class Client {
    public static void main(String[] args) {

        Sheep s1 = new Sheep();
        s1.name = "张三";
        s1.sheepCloneTarget = new SheepClone("李四","李四");

        Sheep s2 = (Sheep) s1.sheepClone();
        System.out.println(s1.sheepCloneTarget.hashCode());
        System.out.println(s2.sheepCloneTarget.hashCode());

    }
}
