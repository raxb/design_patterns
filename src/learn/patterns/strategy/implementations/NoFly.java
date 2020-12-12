package learn.patterns.strategy.implementations;

import learn.patterns.strategy.interfaces.FlyBehavior;

public class NoFly implements FlyBehavior {
    @Override
    public void performFly() {
        System.out.println("I can walk 100 km but cannot fly");
    }
}
