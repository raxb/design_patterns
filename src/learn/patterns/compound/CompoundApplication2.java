package learn.patterns.compound;

public class CompoundApplication2 {
    public static void main(String[] args) {
        CompoundApplication2 application2 = new CompoundApplication2();
        application2.simulate();
    }

    private void simulate() {
        DuckFactory duckFactory = new DuckFactory();
        DuckCounterFactory duckCounterFactory = new DuckCounterFactory(duckFactory);

        Quackable readHead = duckCounterFactory.createRedHeadDuck();
        Quackable duckCall = duckCounterFactory.createDuckCall();
        Quackable rubberDuck = duckCounterFactory.createRubberDuck();
        Quackable goose = new GooseAdapter(new Goose());

        Flock flock = new Flock();
        flock.add(readHead);
        flock.add(duckCall);
        flock.add(rubberDuck);
        flock.add(goose);

        Quackable mallard1 = duckCounterFactory.createMallardDuck();
        Quackable mallard2 = duckCounterFactory.createMallardDuck();
        Quackable mallard3 = duckCounterFactory.createMallardDuck();
        Quackable mallard4 = duckCounterFactory.createMallardDuck();

        Flock mallardFlock = new Flock();
        mallardFlock.add(mallard1);
        mallardFlock.add(mallard2);
        mallardFlock.add(mallard3);
        mallardFlock.add(mallard4);

        flock.add(mallardFlock);

        Quackologist quackologist = new Quackologist();
        flock.registerDuckObserver(quackologist);

        simulate(flock);
        System.out.println("The quacks were heard " + QuackCounter.quackCounts + " times!!");
    }

    public void simulate(Quackable quackable) {
        quackable.quack();
    }
}
