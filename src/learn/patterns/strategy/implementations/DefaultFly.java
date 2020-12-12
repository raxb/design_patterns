package learn.patterns.strategy.implementations;

import learn.patterns.strategy.interfaces.FlyBehavior;

public class DefaultFly implements FlyBehavior {
    @Override
    public void performFly() {
        System.out.println("Default Fly");
    }
}
