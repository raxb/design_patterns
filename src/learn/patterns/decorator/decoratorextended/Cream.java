package learn.patterns.decorator.decoratorextended;

import learn.patterns.decorator.base.Beverage;
import learn.patterns.decorator.base.decorator.CondimentDecorator;

public class Cream extends CondimentDecorator {

    Beverage beverage;

    public Cream(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " With Cream";
    }

    @Override
    public double cost() {
        return beverage.cost() + 2.0;
    }
}
