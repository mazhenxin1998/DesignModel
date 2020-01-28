package com.mzx.proxy.staticproxy;

/**
 * @author ZhenXinMa
 * @date 2020/1/28 20:57
 */
public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println("老师授课中...");
    }
}
