package learn.patterns.strategy.baseclass;

import learn.patterns.strategy.interfaces.FlyBehavior;
import learn.patterns.strategy.interfaces.QuackBehavior;

public class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public void performFly() {
        flyBehavior.performFly();
    }

    public void performQuack() {
        quackBehavior.performQuack();
    }

    public void swim() {
        System.out.println("All ducks can swim");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
