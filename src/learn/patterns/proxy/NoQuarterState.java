package learn.patterns.proxy;

public class NoQuarterState implements State {
    private static final long serialVersionUID = 2L;
    transient GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Quarter Inserted...");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter needs to be inserted...");
    }

    @Override
    public void turnCrank() {
        System.out.println("Without Quarter Crank wont work...");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
