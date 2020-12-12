package learn.patterns.decorator.decoratorextended;

import learn.patterns.decorator.base.Beverage;
import learn.patterns.decorator.base.decorator.CondimentDecorator;

public class Roasted extends CondimentDecorator {

    Beverage beverage;

    public Roasted(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " With Roasting";
    }

    @Override
    public double cost() {
        return beverage.cost() + 10.0;
    }
}
