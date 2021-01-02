package learn.patterns.composite;

import java.util.Iterator;

public class Waitress {
    MenuComponent allMenu;

    public Waitress(MenuComponent allMenu) {
        this.allMenu = allMenu;
    }

    public void printMenuItems() {
        allMenu.print();
    }

    public void printOnlyVegetarian() {
        Iterator<MenuComponent> iterator = allMenu.createIterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException ignored) {
            }
        }
    }
}
