package learn.patterns.templatemethod;

public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping the coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding milk and sugar");
    }

    @Override
    public void hookProcess() {
        System.out.println("Roasting coffee froth");
    }
}
