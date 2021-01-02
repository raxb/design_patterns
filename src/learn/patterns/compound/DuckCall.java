package learn.patterns.compound;

public class DuckCall implements Quackable {
    Observable observable;

    public DuckCall() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak kwak");
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
        return "DuckCall";
    }
}
