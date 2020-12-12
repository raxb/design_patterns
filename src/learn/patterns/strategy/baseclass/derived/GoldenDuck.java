package learn.patterns.strategy.baseclass.derived;

import learn.patterns.strategy.baseclass.Duck;
import learn.patterns.strategy.implementations.FlyWithWings;
import learn.patterns.strategy.implementations.SqueakingSound;

public class GoldenDuck extends Duck {
    public GoldenDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new SqueakingSound();
    }
}
