package learn.patterns.abstractfactory;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        if ("cheese".equals(type)) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Cheese Pizza");
        } else if ("veg".equals(type)) {
            pizza = new VegPizza(pizzaIngredientFactory);
            pizza.setName("New York veg Pizza");
        }
        return pizza;
    }
}
