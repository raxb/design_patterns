package learn.patterns.state;

public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Waiting until gumball is received...");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Crank already turned cannot eject now");
    }

    @Override
    public void turnCrank() {
        System.out.println("One turn one gumball always");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseGumball();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("No more gumballs available");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
