package learn.patterns.factory;


public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        System.out.println("NYPizzaStore Order Received");
        if ("cheese".equals(type)) {
            return new NYCheesePizza();
        } else if ("veg".equals(type)) {
            return new NYVegPizza();
        }
        return null;
    }
}
