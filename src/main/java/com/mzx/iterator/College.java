package com.mzx.iterator;

import java.util.Iterator;

/**
 * @author ZhenXinMa
 * @date 2020/2/2 17:26
 */
public interface College {

     String getName();

     String getDescription();

     void addDepartment(String name,String description);

     Iterator createIterator();

}
