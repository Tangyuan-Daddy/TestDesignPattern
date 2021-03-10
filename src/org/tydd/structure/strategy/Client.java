package org.tydd.structure.strategy;

/**
 * @ Author ：mk
 * @ Date ：Created in 2021/3/10
 * @ Description：高层模块
 */
public class Client {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + new Context(new AddCalculator()).exec(a, b));
        System.out.println("a - b = " + new Context(new SubCalculator()).exec(a, b));
    }
}
