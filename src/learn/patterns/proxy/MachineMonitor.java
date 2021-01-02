package learn.patterns.proxy;

import java.rmi.RemoteException;

public class MachineMonitor {
    GumballMachineRemote machineRemote;

    public MachineMonitor(GumballMachineRemote machineRemote) {
        this.machineRemote = machineRemote;
    }

    public void report() {
        try {
            System.out.println("Location " + machineRemote.getLocation());
            System.out.println("Count " + machineRemote.getCount());
            System.out.println("State " + machineRemote.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
