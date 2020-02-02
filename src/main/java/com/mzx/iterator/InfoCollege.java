package com.mzx.iterator;

import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author ZhenXinMa
 * @date 2020/2/2 17:34
 */
public class InfoCollege implements College {

    private List<Department> departments;
    private int index ;
    private String name;
    private String description;

    public InfoCollege(){

        departments = new ArrayList<Department>();
        index =  0;
        this.name = "信息工程学院";
        addDepartment("网络信息工程学院","网络信息工程学院");
        addDepartment("信息安全学院","信息安全学院");
        addDepartment("服务器信息学院","服务器信息安全学院");

    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void addDepartment(String name, String description) {
        departments.add(new Department(name,description));
        index ++;
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departments);
    }
}
