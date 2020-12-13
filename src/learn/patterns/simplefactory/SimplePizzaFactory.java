package learn.patterns.simplefactory;

public class SimplePizzaFactory {
    Pizza pizza;

    public Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            pizza = new CheesePizza();
        } else if ("veg".equals(type)) {
            pizza = new VegPizza();
        } else if ("chicken".equals(type)) {
            pizza = new ChickenPizza();
        } else {
            pizza = new DefaultPizza();
        }
        return pizza;
    }
}
