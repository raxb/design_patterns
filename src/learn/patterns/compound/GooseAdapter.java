package learn.patterns.compound;

public class GooseAdapter implements Quackable {
    Goose goose;
    Observable observable;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
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
        return "GooseAdapter";
    }
}
