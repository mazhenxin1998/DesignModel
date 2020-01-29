package com.mzx.proxy.cglib;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author ZhenXinMa
 * @date 2020/1/29 16:28
 *
 *      CGLIB代理就是 在内存中创建一个被代理对象的子类
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class ProxyFactory implements MethodInterceptor {

    private Object target;

    /**
     *      创建步骤：
     *          1. 创建Enhancer工具类
     *          2. 设置回调函数
     *          3. 设置父类(因为cglib代理会在内存中创建一个被代理对象的子类来处理)
     *
     * @return  被代理对象的代理对象
     */
    public Object getProxyInstance(){

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);

        return enhancer.create();
    }

    /**
     *
     * @param o             被代理对象
     * @param method        拦截方法
     * @param objects       拦截方法的参数
     * @param methodProxy   代理方法
     * @return              方法的返回值
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("CGLIB代理前执行的操作");
        Object invoke = method.invoke(target, objects);
        System.out.println("CGLIB代理后执行的操作");

        return invoke;
    }
}
