package learn.patterns.iterator;

import java.util.ArrayList;

public class IteratorApplication {
    public static void main(String[] args) {
        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(new PancakeHouseMenu());
        menus.add(new DinerMenu());
        menus.add(new CakeMenu());

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}
