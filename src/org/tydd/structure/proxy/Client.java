package org.tydd.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.util.function.Supplier;

/**
 * @ Author ：mk
 * @ Date ：Created in 2021/2/13
 * @ Description：动态代理场景类
 * 动态代理的主要意图就是解决我们常说的“审计”问 题，也就是横切面编程，在不改变我们已有代码结构的情况下增强或控制对象的行为。
 * 注意：要实现动态代理的首要条件是：被代理类必须实现一个接口，现在也有很多技术如CGLIB可以实现不需要接口也可以实现动态代理的方式。
 */
public class Client {

    public static void main(String[] args) {
        //定义一个主题
        Subject subject = new RealSubject();
        //定义一个Handler
        //InvocationHandler handler = new MyInvocationHandler(subject);
        //定义主题的代理
        /*Subject proxy = DynamicProxy.newProxyInstance(
                subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(),
                handler);*/
        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
        //代理的行为
        proxy.doSomething("Finish.");
    }
}
