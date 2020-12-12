package learn.patterns.strategy.baseclass.derived;

import learn.patterns.strategy.baseclass.Duck;
import learn.patterns.strategy.implementations.NoFly;
import learn.patterns.strategy.implementations.QuackingSound;

public class BlackDuck extends Duck {

    public BlackDuck() {
        flyBehavior = new NoFly();
        quackBehavior = new QuackingSound();
    }

}
