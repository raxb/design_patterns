package learn.patterns.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String description;
    Iterator<MenuComponent> menuComponentIterator = null;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.print(getName());
        System.out.println(", " + getDescription());
        System.out.println("----------------------");
        Iterator<MenuComponent> menuComponentIterator = menuComponents.iterator();
        while (menuComponentIterator.hasNext()) {
            MenuComponent menuComponent = menuComponentIterator.next();
            menuComponent.print();
        }
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        if (menuComponentIterator == null) {
            menuComponentIterator = new CompositeIterator(menuComponents.iterator());
        }
        return menuComponentIterator;
    }
}
