package org.tydd.structure.decoration;

/**
 * @ Author ：mk
 * @ Date ：Created in 2021/2/13
 * @ Description：具体装饰者2
 */
public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component _component) {
        super(_component);
    }

    private void method2() {
        System.out.println("method2 装饰");
    }

    public void operate() {
        super.operate();
        this.method2();
    }
}
