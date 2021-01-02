package learn.patterns.iterator;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
