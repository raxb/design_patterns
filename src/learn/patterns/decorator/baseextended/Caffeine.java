package learn.patterns.decorator.baseextended;

import learn.patterns.decorator.base.Beverage;

public class Caffeine extends Beverage {

    public Caffeine() {
        description = "Caffeine base";
    }

    @Override
    public double cost() {
        return 11.0;
    }
}
