package learn.patterns.decorator.base.decorator;

import learn.patterns.decorator.base.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
