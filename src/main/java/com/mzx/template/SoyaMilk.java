package com.mzx.template;

/**
 * @author ZhenXinMa
 * @date 2020/1/30 17:00
 */
public abstract class SoyaMilk {

    final void make(){
        select();
        add();
        soak();
        beat();
        out();
    }

    public void select(){
        System.out.println("第一步：筛选黄豆");
    }

    public abstract void add();

    public void soak(){
        System.out.println("第三步：将黄豆和配料浸泡2小时");
    }

    public void beat(){
        System.out.println("第四步：将黄豆和配料放入到豆浆机中搅拌");
    }

    public abstract void out();

}
