package org.tydd.structure.proxy.advice;

/**
 * @ Author ：mk
 * @ Date ：Created in 2021/2/13
 * @ Description：前置通知
 */
public class BeforeAdvice implements IAdvice {

    @Override
    public void exec() {
        System.out.println("前置通知被执行了。");
    }
}
