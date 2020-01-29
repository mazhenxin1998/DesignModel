package com.mzx.proxy.cglib;

/**
 * @author ZhenXinMa
 * @date 2020/1/29 16:35
 */
public class Client {
    public static void main(String[] args) {

        TeacherDao teacherDao = new TeacherDao();
        ProxyFactory factory = new ProxyFactory();
        factory.setTarget(teacherDao);

        TeacherDao teacherDaoProxy = (TeacherDao) factory.getProxyInstance();
        String teach = teacherDaoProxy.teach();
        System.out.println(teach);
        System.out.println("----------");
        System.out.println(teacherDaoProxy.getClass());


    }
}
