package org.tydd.structure.decoration;

/**
 * @ Author ：mk
 * @ Date ：Created in 2021/2/13
 * @ Description：具体构件
 */
public class ConcreteComponent extends Component {

    @Override
    public void operate() {
        System.out.println("do something.");
    }
}
