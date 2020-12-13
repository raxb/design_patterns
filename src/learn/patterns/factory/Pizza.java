package learn.patterns.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing... " + name);
        System.out.println("Tossing dough.. " + dough);
        System.out.println("Adding sauce.. " + sauce);
        System.out.println("Adding toppings.. ");
        for (String topping : toppings) {
            System.out.println("Topping.. " + topping);
        }
    }

    public void bake() {
        System.out.println("Baking...");
    }

    public void cut() {
        System.out.println("Cutting in squares...");
    }

    public void box() {
        System.out.println("Packaging and boxing...");
    }

    public String getName() {
        return name;
    }
}
