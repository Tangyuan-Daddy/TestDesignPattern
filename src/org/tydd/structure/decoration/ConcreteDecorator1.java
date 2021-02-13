package org.tydd.structure.decoration;

/**
 * @ Author ：mk
 * @ Date ：Created in 2021/2/13
 * @ Description：具体装饰者1
 */
public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(Component _component) {
        super(_component);
    }

    private void method1() {
        System.out.println("method1 修饰");
    }

    public void operate() {
        this.method1();
        super.operate();
    }
}
