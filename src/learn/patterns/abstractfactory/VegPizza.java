package learn.patterns.abstractfactory;

public class VegPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public VegPizza(PizzaIngredientFactory factory) {
        pizzaIngredientFactory = factory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing ... " + name);
        veggies = pizzaIngredientFactory.createVeggies();
        dough = pizzaIngredientFactory.createDough();
        pepperoni = pizzaIngredientFactory.createPepperoni();
        sauce = pizzaIngredientFactory.createSauce();
    }
}
