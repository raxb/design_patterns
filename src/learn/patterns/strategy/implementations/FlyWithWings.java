package learn.patterns.strategy.implementations;

import learn.patterns.strategy.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void performFly() {
        System.out.println("I can fly");
    }
}
