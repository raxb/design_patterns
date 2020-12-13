package learn.patterns.factory;

public class FactoryApplication {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");

        PizzaStore mxPizzaStore = new MexicanPizzaStore();
        mxPizzaStore.orderPizza("cheese");

    }
}
