package learn.patterns.compound;

public abstract class AbstractDuckFactory {
    abstract Quackable createMallardDuck();

    abstract Quackable createRedHeadDuck();

    abstract Quackable createDuckCall();

    abstract Quackable createRubberDuck();
}
