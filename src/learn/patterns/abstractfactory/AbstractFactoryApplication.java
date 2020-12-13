package learn.patterns.abstractfactory;

public class AbstractFactoryApplication {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");

        nyPizzaStore.orderPizza("veg");
    }
}
