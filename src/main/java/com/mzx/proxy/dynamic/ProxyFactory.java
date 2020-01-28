package com.mzx.proxy.dynamic;

import lombok.AllArgsConstructor;
import lombok.Data;
import sun.reflect.generics.scope.MethodScope;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ZhenXinMa
 * @date 2020/1/28 21:18
 */
@Data
@AllArgsConstructor
public class ProxyFactory {

    private Object target;

    public Object getProxyInstance(){
        /**
         *  参数含义：
         *      1. 被代理对象类加载器
         *      2. 被代理对象实现的接口(因为JDK代理是基于接口代理)
         *      3. 通过反射机制创建代理方法 通过这个方法 来确定 代理类中的那个方法
         */
      return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
          /**
           *        参数含义:
           * @param proxy   被代理类
           * @param method  当前被代理类要执行的方法
           * @param args    方法的参数
           * @return        执行当前被代理类要返回的值
           * @throws Throwable
           */
          @Override
          public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

              Object returnVal = null;

              if(method.getName().equals("teach")){
                  /**
                   *  参数含义：
                   *        1. 被代理类
                   *        2. 当前执行方法的参数
                   */
                  System.out.println("代理前要执行的操作");
                  /**
                   *  该行代码会执行target里面的方法 至于执行那个方法 有入口点确定调用的那个方法
                   */
                   returnVal = method.invoke(target,args);
                  System.out.println("代理后要执行的操作");
              }else{
                  /**
                   *  参数含义：
                   *        1. 被代理类
                   *        2. 当前执行方法的参数
                   */
                  System.out.println("代理前要执行的操作");
                  System.out.println(args[0]+"say前刷牙");
                  /**
                   *  该行代码会执行target里面的方法 至于执行那个方法 有入口点确定调用的那个方法
                   */
                   returnVal = method.invoke(target,args);
                  System.out.println("代理后要执行的操作");
              }

              return returnVal;
          }
      });

    }


}
