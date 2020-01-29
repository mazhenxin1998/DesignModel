package com.mzx.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

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

        System.out.println("不使用ProxyFactory----------------------");
        TeacherDao o = (TeacherDao) Enhancer.create(teacherDao.getClass(), new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("开始代理");
                Object invoke = method.invoke(teacherDao, objects);
                System.out.println("代理结束");
                System.out.println(invoke);
                return invoke;
            }
        });
        o.teach();


    }
}
