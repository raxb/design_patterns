package learn.patterns.decorator.baseextended;

import learn.patterns.decorator.base.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso base";
    }

    @Override
    public double cost() {
        return 10.0;
    }
}
