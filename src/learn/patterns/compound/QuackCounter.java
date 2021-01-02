package learn.patterns.compound;

public class QuackCounter implements Quackable {
    static int quackCounts;
    Quackable quackable;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    public static int getQuackCounts() {
        return quackCounts;
    }

    @Override
    public void quack() {
        quackable.quack();
        quackCounts++;
    }

    @Override
    public void registerDuckObserver(DuckObserver observer) {
        quackable.registerDuckObserver(observer);
    }

    @Override
    public void notifyDuckObserver() {
        quackable.notifyDuckObserver();
    }
}
