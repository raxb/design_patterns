package learn.patterns.decorator.baseextended;

import learn.patterns.decorator.base.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast base";
    }

    @Override
    public double cost() {
        return 15.0;
    }
}
