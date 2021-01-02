package learn.patterns.compound;

public class RedHeadDuck implements Quackable {
    Observable observable;

    public RedHeadDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("RedHead duck quacks");
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
        return "RedHeadDuck";
    }
}
