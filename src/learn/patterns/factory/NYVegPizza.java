package learn.patterns.factory;


public class NYVegPizza extends Pizza {
    public NYVegPizza() {
        name = "NewYork Vegetarian Pizza";
        dough = "Thin Crust";
        sauce = "Barbeque";
        toppings.add("Grated Cheese");
    }
}
