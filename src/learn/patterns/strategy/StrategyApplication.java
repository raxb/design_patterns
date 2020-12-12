package learn.patterns.strategy;

import learn.patterns.strategy.baseclass.Duck;
import learn.patterns.strategy.baseclass.derived.BlackDuck;
import learn.patterns.strategy.baseclass.derived.GoldenDuck;
import learn.patterns.strategy.baseclass.derived.WhiteDuck;
import learn.patterns.strategy.implementations.NoFly;
import learn.patterns.strategy.implementations.SqueakingSound;

public class StrategyApplication {
    public static void main(String[] args) {
        Duck blackDuck = new BlackDuck();
        System.out.println("Black Duck Properties/Features");
        blackDuck.performFly();
        blackDuck.performQuack();
        blackDuck.swim();

        Duck goldenDuck = new GoldenDuck();
        System.out.println("Golden Duck Properties/Features");
        goldenDuck.performFly();
        goldenDuck.performQuack();
        goldenDuck.swim();

        Duck whiteDuck = new WhiteDuck();
        System.out.println("White Duck Properties/Features");
        whiteDuck.performFly();
        whiteDuck.performQuack();
        System.out.println("White Duck Time to dynamically update...");
        whiteDuck.setFlyBehavior(new NoFly());
        whiteDuck.setQuackBehavior(new SqueakingSound());
        whiteDuck.performFly();
        whiteDuck.performQuack();
        whiteDuck.swim();
    }
}
