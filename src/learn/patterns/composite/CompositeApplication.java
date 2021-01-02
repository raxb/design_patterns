package learn.patterns.composite;

public class CompositeApplication {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PancakeHouse Menu", "Breakfast");
        MenuComponent dinerMenu = new Menu("Diner Menu", "Lunch");
        MenuComponent cakeMenu = new Menu("Cake Menu", "Dessert");
        MenuComponent sweetsMenu = new Menu("Sweets Menu", "Snacks");

        MenuComponent allMenus = new Menu("All Menus", "Combined Menus");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cakeMenu);

        pancakeHouseMenu.add(new MenuItem("Plain Pancake Breakfast", "Pancakes with scrambled eggs, and toast", false,
                2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, and sausage", false
                , 5.00));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancake", "Pancakes with fresh blueberries", true, 3.99));
        pancakeHouseMenu.add(new MenuItem("Waffles Pancake", "Waffles with blueberry (or) strawberry", true, 4.99));

        dinerMenu.add(new MenuItem("Plain Biryani", "Only Rice with Biryani masala flavor", true, 2.99));
        dinerMenu.add(new MenuItem("Chicken Biryani", "Biryani Rice with Chicken and egg", false, 3.99));
        dinerMenu.add(new MenuItem("Mutton Biryani", "Biryani Rice with Mutton and egg masala", false, 4.99));
        dinerMenu.add(new MenuItem("Chicken FriedRice", "Rice with Chicken, egg and veggies", false, 3.99));
        dinerMenu.add(new MenuItem("Egg FriedRice", "Rice with scrambled egg masala with veggies", false, 2.99));
        dinerMenu.add(new MenuItem("Veg FriedRice", "Rice with roasted with veggies", true, 2.59));

        cakeMenu.add(new MenuItem("Cream Cake", "Plain Cake base with Cream topping", true, 1.99));
        cakeMenu.add(new MenuItem("PineApple Cake", "PineApple Cake base with Cream topping", false, 2.99));
        cakeMenu.add(new MenuItem("Honey Cake", "Plain Cake base with Honey immersed layers topping", true, 5.99));
        cakeMenu.add(new MenuItem("Blackforest Cake", "Chocolate Cake base with waffles topping", false, 4.99));

        sweetsMenu.add(new MenuItem("Milk Sweet", "Dairy Milk dipped", true, 2.99));
        sweetsMenu.add(new MenuItem("Jaggery Sweet", "Roasted honey dipped", true, 4.99));
        sweetsMenu.add(new MenuItem("Dry Fruit Sweet", "Dry Fruits dipped", true, 3.99));

        cakeMenu.add(sweetsMenu);

        Waitress waitress = new Waitress(allMenus);
        //waitress.printMenuItems();
        waitress.printOnlyVegetarian();
    }
}
