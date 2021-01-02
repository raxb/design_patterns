package learn.patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("Plain Pancake Breakfast", "Pancakes with scrambled eggs, and toast", false, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, and sausage", false, 5.00);
        addItem("Blueberry Pancake", "Pancakes with fresh blueberries", true, 3.99);
        addItem("Waffles Pancake", "Waffles with blueberry (or) strawberry", true, 4.99);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
