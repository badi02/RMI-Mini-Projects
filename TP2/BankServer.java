package TP2;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class BankServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            BankAccountImpl bankAccount = new BankAccountImpl();
            Naming.rebind("BankAccount", bankAccount);
            System.out.println("Bank server is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

