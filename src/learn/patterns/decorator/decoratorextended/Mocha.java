package learn.patterns.decorator.decoratorextended;


import learn.patterns.decorator.base.Beverage;
import learn.patterns.decorator.base.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " With Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 5.0;
    }
}
