package com.mzx.iterator;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Iterator;
import java.util.List;

/**
 * @author ZhenXinMa
 * @date 2020/2/2 17:24
 *
 *       信息工程学院模拟List集合
 *
 */
@Data
@Accessors
public class InfoCollegeIterator implements Iterator {

    private List<Department> departments;
    private int index ;

    public InfoCollegeIterator(List<Department> departments){
        this.departments = departments;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        if(index > departments.size()-1 || departments.get(index) == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments.get(index);
        index ++ ;
        return department;
    }
}
