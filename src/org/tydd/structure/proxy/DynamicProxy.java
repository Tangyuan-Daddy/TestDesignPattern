package org.tydd.structure.proxy;

import org.tydd.structure.proxy.advice.BeforeAdvice;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @ Author ：mk
 * @ Date ：Created in 2021/2/13
 * @ Description：动态代理类
 */
public class DynamicProxy<T> {

    public static <T> T newProxyInstance(ClassLoader classLoader, Class<?> [] interfaces, InvocationHandler handler) {
        if (true) {
            (new BeforeAdvice()).exec();
        }
        return (T) Proxy.newProxyInstance(classLoader, interfaces, handler);
    }
}
