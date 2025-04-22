package tprmi;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class StringServiceImpl extends UnicastRemoteObject implements StringService {
    public StringServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public String reverseString(String input) throws RemoteException {
        return new StringBuilder(input).reverse().toString();
    }
}
