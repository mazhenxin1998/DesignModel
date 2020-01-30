package com.mzx.template;

/**
 * @author ZhenXinMa
 * @date 2020/1/30 17:02
 */
public class ReadBeanSoyaMilk extends SoyaMilk {
    @Override
    public void out() {
        System.out.println("第五步：红豆豆浆出锅！");
    }

    @Override
    public void add() {
        System.out.println("第二步：添加红豆配料");
    }
}
