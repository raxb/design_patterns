package learn.patterns.compound;

public class MallardDuck implements Quackable {
    Observable observable;

    public MallardDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Mallard duck quacks");
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
        return "MallardDuck";
    }
}
