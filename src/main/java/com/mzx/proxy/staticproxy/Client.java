package com.mzx.proxy.staticproxy;

/**
 * @author ZhenXinMa
 * @date 2020/1/28 20:58
 */
public class Client {
    public static void main(String[] args) {
        TeacherDaoProxy proxy = new TeacherDaoProxy(new TeacherDao());
        proxy.teach();
    }
}
