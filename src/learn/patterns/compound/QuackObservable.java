package learn.patterns.compound;

public interface QuackObservable {
    void registerDuckObserver(DuckObserver observer);

    void notifyDuckObserver();
}
