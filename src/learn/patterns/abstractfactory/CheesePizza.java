package learn.patterns.abstractfactory;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory factory) {
        pizzaIngredientFactory = factory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing ... " + name);
        cheese = pizzaIngredientFactory.createCheese();
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
    }
}
