package learn.patterns.strategy.implementations;

public class SqueakingSound implements learn.patterns.strategy.interfaces.QuackBehavior {
    @Override
    public void performQuack() {
        System.out.println("I do squeaking noises");
    }
}
