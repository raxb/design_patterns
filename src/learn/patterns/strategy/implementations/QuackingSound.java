package learn.patterns.strategy.implementations;

import learn.patterns.strategy.interfaces.QuackBehavior;

public class QuackingSound implements QuackBehavior {
    @Override
    public void performQuack() {
        System.out.println("I do quacking sounds");
    }
}
