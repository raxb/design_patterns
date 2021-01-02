package learn.patterns.proxy;

import java.rmi.Naming;

public class RemoteProxyServerApplication {
    public static void main(String[] args) {
        GumballMachineRemote gumballMachineRemote = null;
        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(0);
        }
        int count = Integer.parseInt(args[1]);
        try {
            gumballMachineRemote = new GumballMachine(args[0], count);
            Naming.rebind(args[0], gumballMachineRemote);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
