package tprmi;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BankAccount extends Remote {
    void deposit(double amount) throws RemoteException;
    void withdraw(double amount) throws RemoteException;
    double getBalance() throws RemoteException;
}