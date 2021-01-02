package learn.patterns.compound;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Observable implements QuackObservable {
    List<DuckObserver> duckObserverList = new ArrayList<>();
    QuackObservable quackObservable;

    public Observable(QuackObservable quackObservable) {
        this.quackObservable = quackObservable;
    }

    @Override
    public void registerDuckObserver(DuckObserver observer) {
        duckObserverList.add(observer);
    }

    @Override
    public void notifyDuckObserver() {
        Iterator<DuckObserver> duckObserverIterator = duckObserverList.iterator();
        while (duckObserverIterator.hasNext()) {
            DuckObserver duckObserver = duckObserverIterator.next();
            duckObserver.update(quackObservable);
        }
    }
}
