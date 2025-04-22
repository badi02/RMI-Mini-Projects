package tprmi;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class StringServiceServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1399);
            StringServiceImpl service = new StringServiceImpl();
            Naming.rebind("StringService", service);
            System.out.println("String service is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
