package org.tydd.structure.strategy;

/**
 * @ Author ：mk
 * @ Date ：Created in 2021/3/10
 * @ Description：具体的策略角色
 */
public class AddCalculator implements Calculator {

    @Override
    public int exec(int a, int b) {
        return a + b;
    }
}
