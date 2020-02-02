package com.mzx.iterator;

import lombok.Data;

import java.util.Iterator;

/**
 * @author ZhenXinMa
 * @date 2020/2/2 17:29
 */
@Data
public class ComputerCollege implements College {

    private String name;
    private String description;
    private Department[] departments;
    private int index;

    public ComputerCollege(){
        this.name = "计算机与信息工程学院";
        index = 0;
        departments = new Department[5];
        addDepartment("计算机与科学学院","计算机与科学学院");
        addDepartment("软件工程","软件工程");
        addDepartment("网络工程","网络工程");

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
        departments[index] = new Department(name,description);
        index ++ ;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
