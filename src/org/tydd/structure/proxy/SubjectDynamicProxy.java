package org.tydd.structure.proxy;

import java.lang.reflect.InvocationHandler;

/**
 * @ Author ：mk
 * @ Date ：Created in 2021/2/13
 * @ Description：
 */
public class SubjectDynamicProxy extends DynamicProxy {

    public static <T> T newProxyInstance(Subject subject) {
        ClassLoader classLoader = subject.getClass().getClassLoader();
        Class<?> [] classes = subject.getClass().getInterfaces();
        InvocationHandler handler = new MyInvocationHandler(subject);
        return newProxyInstance(classLoader, classes, handler);
    }
}
