package learn.patterns.proxy;

public class SoldOutState implements State {
    private static final long serialVersionUID = 2L;
    transient GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("No gumballs available, please eject");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter needs to be inserted first");
    }

    @Override
    public void turnCrank() {
        System.out.println("Insert Quarter and verify gumball availability before turning");
    }

    @Override
    public void dispense() {
        System.out.println("No gumballs dispensed");
    }
}
