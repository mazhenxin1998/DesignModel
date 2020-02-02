package com.mzx.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author ZhenXinMa
 * @date 2020/2/2 17:38
 */
public class OutputImpl {
   
    private List<College> colleges;
    
    public OutputImpl(List<College> colleges){
        this.colleges = colleges;
    }
    
    public void printCollege(){
        Iterator iterator = colleges.iterator();
        while(iterator.hasNext()){

            College college = (College) iterator.next();
            System.out.println("====="+college.getName()+"的信息=======");
            printXi(college.createIterator());

        }
    }
    
    
    public void printXi(Iterator iterator){
        while(iterator.hasNext()){
            Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }
    }
    
    
}
