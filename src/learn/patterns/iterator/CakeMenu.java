package learn.patterns.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CakeMenu implements Menu {
    Map<String, MenuItem> menuItemMap = new HashMap<>();

    public CakeMenu() {
        addMenuItem("Cream Cake", "Plain Cake base with Cream topping", true, 1.99);
        addMenuItem("PineApple Cake", "PineApple Cake base with Cream topping", false, 2.99);
        addMenuItem("Honey Cake", "Plain Cake base with Honey immersed layers topping", true, 5.99);
        addMenuItem("Blackforest Cake", "Chocolate Cake base with waffles topping", false, 4.99);
    }

    private void addMenuItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItemMap.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItemMap.values().iterator();
    }
}
