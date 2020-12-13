package learn.patterns.simplefactory;

public class Pizza {
    public void prepare() {
        System.out.println("Preparing the base");
    }

    public void bake() {
        System.out.println("Baking the ingredients with base");
    }

    public void cut() {
        System.out.println("Cutting the pizza diagonally");
    }

    public void box() {
        System.out.println("Packaging and boxing it up for delivery");
    }
}
