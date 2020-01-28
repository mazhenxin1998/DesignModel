package com.mzx.groupmodel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhenXinMa
 * @date 2020/1/28 15:42
 */
public class Colleage extends OriginComponent {

    private List<OriginComponent> department = new ArrayList<OriginComponent>();

    public Colleage(String name, String description) {
        super(name, description);
    }

    @Override
    public void add(OriginComponent originComponent) {
        department.add(originComponent);
    }

    @Override
    public void remove(OriginComponent originComponent) {
        department.remove(originComponent);
    }

    @Override
    public void print() {
        System.out.println("输出"+this.getName()+"信息");
        for (OriginComponent originComponent : department) {
            System.out.println(originComponent.getName()+"  信息:"+originComponent.getDescription());
        }
    }
}
