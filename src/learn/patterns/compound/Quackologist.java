package learn.patterns.compound;

public class Quackologist implements DuckObserver {
    @Override
    public void update(QuackObservable quackObservable) {
        System.out.println("Quackologist: " + quackObservable + " invoked");
    }
}
