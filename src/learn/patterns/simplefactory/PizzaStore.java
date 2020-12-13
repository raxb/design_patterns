package learn.patterns.simplefactory;

public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        factory = simplePizzaFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);

        System.out.println("Order Received for " + type + " pizza");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
