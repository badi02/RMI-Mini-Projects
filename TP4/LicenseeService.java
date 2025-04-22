package TP4;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface LicenseeService extends Remote {
    void addLicensee(String name, String licenseNumber) throws RemoteException;
    void removeLicensee(String licenseNumber) throws RemoteException;
    void updateLicensee(String oldLicenseNumber, String newName, String newLicenseNumber) throws RemoteException;
    String getLicenseeInfo(String licenseNumber) throws RemoteException;
}
