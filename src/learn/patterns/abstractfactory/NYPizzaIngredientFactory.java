package learn.patterns.abstractfactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        System.out.println("NY Style Thin Crust Dough");
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        System.out.println("NY Style Barbeque Sauce");
        return new BarbequeSauce();
    }

    @Override
    public Cheese createCheese() {
        System.out.println("NY Style Parmesan Cheese");
        return new ParmesanCheese();
    }

    @Override
    public Veggie[] createVeggies() {
        System.out.println("NY Style garlic and onion veggies");
        return new Veggie[]{new Garlic(), new Onion()};
    }

    @Override
    public Pepperoni createPepperoni() {
        System.out.println("NY Style Sliced Pepperoni");
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        System.out.println("NY Style Fresh Clams");
        return new FreshClams();
    }
}
