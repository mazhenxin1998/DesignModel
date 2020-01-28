package com.mzx.proxy.dynamic;

/**
 * @author ZhenXinMa
 * @date 2020/1/28 21:26
 */
public class Client {

    public static void main(String[] args) {

        ITeacherDao teacherDao = new TeacherDao();

        ProxyFactory factory = new ProxyFactory(teacherDao);

        ITeacherDao teacherDaoProxy = (ITeacherDao) factory.getProxyInstance();
        teacherDaoProxy.teach();
        //teacherDaoProxy.say("张三");

        System.out.println("-------");

        System.out.println("被代理对象的类型:"+teacherDaoProxy.getClass());

    }

}
