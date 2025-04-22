package TP4;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class LicenseeServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);  // Port par défaut pour RMI
            LicenseeServiceImpl service = new LicenseeServiceImpl();
            Naming.rebind("LicenseeService", service);
            System.out.println("Licensee service is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
