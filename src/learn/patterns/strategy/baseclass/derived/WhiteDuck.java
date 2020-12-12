package learn.patterns.strategy.baseclass.derived;

import learn.patterns.strategy.baseclass.Duck;
import learn.patterns.strategy.implementations.DefaultFly;
import learn.patterns.strategy.implementations.DefaultQuack;

public class WhiteDuck extends Duck {
    public WhiteDuck() {
        flyBehavior = new DefaultFly();
        quackBehavior = new DefaultQuack();
    }
}
