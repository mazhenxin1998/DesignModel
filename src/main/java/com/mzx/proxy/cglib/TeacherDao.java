package com.mzx.proxy.cglib;

/**
 * @author ZhenXinMa
 * @date 2020/1/29 16:27
 */
public class TeacherDao {

    public String teach(){
        System.out.println("老师开始授课了");
        return "授课完毕!";
    }

}
