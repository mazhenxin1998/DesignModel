package com.mzx.iterator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Iterator;

/**
 * @author ZhenXinMa
 * @date 2020/2/2 17:17
 *
 *         计算机学院模拟用数组进行实现
 */
@Data
@Accessors
public class ComputerCollegeIterator implements Iterator {

    private Department[] objects;
    private int index = 0;

    public ComputerCollegeIterator(Department[] objects){
        this.objects = objects;

    }

    @Override
    public boolean hasNext() {
        if(index > objects.length || objects[index] == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = objects[index];
        index ++ ;
        return department;
    }

}
