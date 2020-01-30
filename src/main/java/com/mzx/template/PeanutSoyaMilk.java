package com.mzx.template;

/**
 * @author ZhenXinMa
 * @date 2020/1/30 17:03
 */
public class PeanutSoyaMilk extends SoyaMilk {

    @Override
    public void out() {
        System.out.println("第五步：花生豆浆出锅！");
    }

    @Override
    public void add() {
        System.out.println("第二步：添加花生配料");
    }
}
