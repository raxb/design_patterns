package learn.patterns.observer.interfaces;

public interface Subject {
    void registerObserver(CustomObserver o);

    void removeObserver(CustomObserver o);

    void notifyObservers();

}
