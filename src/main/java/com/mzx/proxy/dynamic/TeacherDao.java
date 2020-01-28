package com.mzx.proxy.dynamic;

import lombok.AllArgsConstructor;

/**
 * @author ZhenXinMa
 * @date 2020/1/28 21:18
 */
@AllArgsConstructor
public class TeacherDao implements ITeacherDao {


    @Override
    public void teach() {
        System.out.println("老师授课中...");
    }

    @Override
    public void say(String name) {
        System.out.println(name+"say hallow");
    }
}
