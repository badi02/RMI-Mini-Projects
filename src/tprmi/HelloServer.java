package tprmi;

import java.rmi.Naming;

public class HelloServer {
    public static void main(String[] argv) {
        try {
            Hello hello = new Hello("Hello World!");
            Naming.rebind("Hello", hello);
            System.out.println("Server is connected and ready for operation.");
        } catch (Exception e) {
            System.out.println("Server not connected: " + e);
        }
    }
}
