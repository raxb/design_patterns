package learn.patterns.compound;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable {
    List<Quackable> quackableList = new ArrayList<>();

    public void add(Quackable quackable) {
        quackableList.add(quackable);
    }

    @Override
    public void quack() {
        Iterator<Quackable> quackableIterator = quackableList.iterator();
        while (quackableIterator.hasNext()) {
            Quackable quackable = quackableIterator.next();
            quackable.quack();
        }
    }

    @Override
    public void registerDuckObserver(DuckObserver observer) {
        Iterator<Quackable> quackableIterator = quackableList.iterator();
        while (quackableIterator.hasNext()) {
            Quackable quackable = quackableIterator.next();
            quackable.registerDuckObserver(observer);
        }
    }

    @Override
    public void notifyDuckObserver() {

    }
}
