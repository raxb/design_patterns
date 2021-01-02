package learn.patterns.compound;

public class CompoundApplication {
    public static void main(String[] args) {
        CompoundApplication application = new CompoundApplication();
        application.simulate();
    }

    private void simulate() {
        DuckFactory duckFactory = new DuckFactory();
        DuckCounterFactory duckCounterFactory = new DuckCounterFactory(duckFactory);

        /*Quackable mallard = new QuackCounter(new MallardDuck());
        Quackable readHead = new QuackCounter(new RedHeadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable goose = new GooseAdapter(new Goose());*/


        Quackable mallard = duckCounterFactory.createMallardDuck();
        Quackable readHead = duckCounterFactory.createRedHeadDuck();
        Quackable duckCall = duckCounterFactory.createDuckCall();
        Quackable rubberDuck = duckCounterFactory.createRubberDuck();
        Quackable goose = new GooseAdapter(new Goose());

        simulate(mallard);
        simulate(readHead);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);

        System.out.println("The ducks quacked " + QuackCounter.quackCounts + " times!");
    }

    private void simulate(Quackable quackable) {
        quackable.quack();
    }

}
