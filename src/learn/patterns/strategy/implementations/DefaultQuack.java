package learn.patterns.strategy.implementations;

import learn.patterns.strategy.interfaces.QuackBehavior;

public class DefaultQuack implements QuackBehavior {
    @Override
    public void performQuack() {
        System.out.println("Default Quack");
    }
}
