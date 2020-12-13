package learn.patterns.factory;

public class MexicanCheesePizza extends Pizza {
    public MexicanCheesePizza() {
        name = "Mexican Hot Pizza";
        dough = "Thick Crust";
        sauce = "Mint";
        toppings.add("Cheese Flakes");
    }

    @Override
    public void cut(){
        System.out.println("Cutting in diamonds...");
    }
}
