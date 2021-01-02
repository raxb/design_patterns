package learn.patterns.compound;

public class RubberDuck implements Quackable {
    Observable observable;

    public RubberDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Squeak Squeak");
        notifyDuckObserver();
    }

    @Override
    public void registerDuckObserver(DuckObserver observer) {
        observable.registerDuckObserver(observer);
    }

    @Override
    public void notifyDuckObserver() {
        observable.notifyDuckObserver();
    }

    @Override
    public String toString() {
        return "RubberDuck";
    }
}
