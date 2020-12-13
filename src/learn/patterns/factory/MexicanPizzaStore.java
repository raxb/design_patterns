package learn.patterns.factory;

public class MexicanPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        System.out.println("MexicanPizzaStore Order Received");
        if ("cheese".equals(type)) {
            return new MexicanCheesePizza();
        }
        return null;
    }
}
