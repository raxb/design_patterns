package learn.patterns.adapter;

public class AdapterApplication {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Turkey wild = new WildTurkey();

        Duck withTurkey = new TurkeyAdapter(wild);
        testDuck(mallard);
        testDuck(withTurkey);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
