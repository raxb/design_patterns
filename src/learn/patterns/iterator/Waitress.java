package learn.patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    ArrayList<Menu> menuList;

    public Waitress(ArrayList<Menu> menuList) {
        this.menuList = menuList;
    }

    public void printMenu() {
        Iterator<Menu> menuIterator = menuList.iterator();
        while (menuIterator.hasNext()) {
            Menu menu = menuIterator.next();
            printItems(menu.createIterator());
        }
    }

    private void printItems(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + " -- ");
            System.out.print("(" + (menuItem.isVegetarian() ? "V" : "NV") + ") -- ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
