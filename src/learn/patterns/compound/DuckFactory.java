package learn.patterns.compound;

public class DuckFactory extends AbstractDuckFactory {
    @Override
    Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    Quackable createRedHeadDuck() {
        return new RedHeadDuck();
    }

    @Override
    Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
