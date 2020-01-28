package com.mzx.groupmodel;

import org.ietf.jgss.Oid;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhenXinMa
 * @date 2020/1/28 15:36
 */
public class University extends OriginComponent {

    private List<OriginComponent> university = new ArrayList<OriginComponent>();

    public University(String name, String description) {
        super(name, description);
    }

    @Override
    public void add(OriginComponent originComponent){
        university.add(originComponent);
    }

    @Override
    public void remove(OriginComponent originComponent) {
        university.remove(originComponent);
    }

    @Override
    public void print() {
        System.out.println(this.getName()+this.getDescription());
        for (OriginComponent originComponent : university) {
            originComponent.print();
        }
    }
}
