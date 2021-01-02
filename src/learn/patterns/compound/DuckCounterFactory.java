package learn.patterns.compound;

public class DuckCounterFactory extends AbstractDuckFactory {
    DuckFactory duckFactory;

    public DuckCounterFactory(DuckFactory duckFactory) {
        this.duckFactory = duckFactory;
    }

    @Override
    Quackable createMallardDuck() {
        return new QuackCounter(duckFactory.createMallardDuck());
    }

    @Override
    Quackable createRedHeadDuck() {
        return new QuackCounter(duckFactory.createRedHeadDuck());
    }

    @Override
    Quackable createDuckCall() {
        return new QuackCounter(duckFactory.createDuckCall());
    }

    @Override
    Quackable createRubberDuck() {
        return new QuackCounter(duckFactory.createRubberDuck());
    }
}
