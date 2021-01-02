package learn.patterns.iterator;

import java.util.Iterator;

public class DinerMenu implements Menu {
    static final int MAX_MENU_ITEMS = 6;
    MenuItem[] menuItems;
    int count = 0;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_MENU_ITEMS];
        addItem("Plain Biryani", "Only Rice with Biryani masala flavor", true, 2.99);
        addItem("Chicken Biryani", "Biryani Rice with Chicken and egg", false, 3.99);
        addItem("Mutton Biryani", "Biryani Rice with Mutton and egg masala", false, 4.99);
        addItem("Chicken FriedRice", "Rice with Chicken, egg and veggies", false, 3.99);
        addItem("Egg FriedRice", "Rice with scrambled egg masala with veggies", false, 2.99);
        addItem("Veg FriedRice", "Rice with roasted with veggies", true, 2.59);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (count > MAX_MENU_ITEMS) {
            System.out.println("Menu is full, cannot add further");
        } else {
            menuItems[count] = menuItem;
            count++;
        }
    }

    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
