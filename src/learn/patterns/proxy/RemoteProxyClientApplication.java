package learn.patterns.proxy;

import java.rmi.Naming;

public class RemoteProxyClientApplication {
    public static void main(String[] args) {
        String[] location = {"rmi://remote1", "rmi://remote2", "rmi://remote3"};
        MachineMonitor[] machineMonitors = new MachineMonitor[location.length];
        for (int i = 0; i < location.length; i++) {
            try {
                GumballMachineRemote remote = (GumballMachineRemote) Naming.lookup(location[i]);
                machineMonitors[i] = new MachineMonitor(remote);
                System.out.println(machineMonitors[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < machineMonitors.length; i++) {
            machineMonitors[i].report();
        }
    }
}
