package learn.patterns.templatemethod;

public abstract class CaffeineBeverage {

    final void prepareBeverage() {
        boilWater();
        brew();
        pourTo();
        if (condimentRequired()) {
            addCondiments();
        }
        hookProcess();
    }

    public boolean condimentRequired() {
        return true;
    }

    public void hookProcess() {
    }

    private void pourTo() {
        System.out.println("Pouring the Beverage into Cup");
    }

    private void boilWater() {
        System.out.println("Boiling the water");
    }

    abstract void brew();

    abstract void addCondiments();
}
