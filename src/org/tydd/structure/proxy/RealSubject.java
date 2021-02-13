package org.tydd.structure.proxy;

/**
 * @ Author ：mk
 * @ Date ：Created in 2021/2/13
 * @ Description：真实主题类
 */
public class RealSubject implements Subject {

    @Override
    public void doSomething(String str) {
        System.out.println("do something!------>" + str);
    }
}
