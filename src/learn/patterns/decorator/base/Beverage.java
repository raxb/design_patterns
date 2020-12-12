package learn.patterns.decorator.base;

public abstract class Beverage {

    public String description = "unknown";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
