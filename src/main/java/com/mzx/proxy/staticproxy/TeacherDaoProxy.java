package com.mzx.proxy.staticproxy;

import lombok.AllArgsConstructor;

/**
 * @author ZhenXinMa
 * @date 2020/1/28 20:57
 */
@AllArgsConstructor
public class TeacherDaoProxy implements ITeacherDao {

    private ITeacherDao iTeacherDao;

    @Override
    public void teach() {
        System.out.println("代理前要执行的操作");
        iTeacherDao.teach();
        System.out.println("代理后要执行的操作");
    }
}
