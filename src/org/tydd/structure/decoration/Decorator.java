package org.tydd.structure.decoration;

import java.util.Base64.Decoder;

/**
 * @ Author ：mk
 * @ Date ：Created in 2021/2/13
 * @ Description：抽象装饰者
 */
public abstract class Decorator extends Component {

    private Component component = null;

    public Decorator(Component _component) {
        this.component = _component;
    }

    @Override
    public void operate() {
        this.component.operate();
    }
}
