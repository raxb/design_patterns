package learn.patterns.simplefactory;

public class SimpleFactoryApplication {
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
        pizzaStore.orderPizza("cheese");

        pizzaStore.orderPizza("pepper");

        pizzaStore.orderPizza("veg");
    }
}
