package tprmi;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StringService extends Remote {
    String reverseString(String input) throws RemoteException;
}
