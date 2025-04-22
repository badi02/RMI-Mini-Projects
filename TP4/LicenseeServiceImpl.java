package TP4;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public class LicenseeServiceImpl extends UnicastRemoteObject implements LicenseeService {
    private Map<String, String> licensees;  // Map pour stocker les licenciés (licenseNumber -> name)

    public LicenseeServiceImpl() throws RemoteException {
        super();
        this.licensees = new HashMap<>();
    }

    @Override
    public void addLicensee(String name, String licenseNumber) throws RemoteException {
        licensees.put(licenseNumber, name);
        System.out.println("Licensee added: " + name + " with License Number: " + licenseNumber);
    }

    @Override
    public void removeLicensee(String licenseNumber) throws RemoteException {
        if (licensees.containsKey(licenseNumber)) {
            licensees.remove(licenseNumber);
            System.out.println("Licensee removed: " + licenseNumber);
        } else {
            System.out.println("Licensee not found: " + licenseNumber);
        }
    }

    @Override
    public void updateLicensee(String oldLicenseNumber, String newName, String newLicenseNumber) throws RemoteException {
        if (licensees.containsKey(oldLicenseNumber)) {
            licensees.remove(oldLicenseNumber);
            licensees.put(newLicenseNumber, newName);
            System.out.println("Licensee updated: " + newName + " with License Number: " + newLicenseNumber);
        } else {
            System.out.println("Licensee not found: " + oldLicenseNumber);
        }
    }

    @Override
    public String getLicenseeInfo(String licenseNumber) throws RemoteException {
        if (licensees.containsKey(licenseNumber)) {
            return "Name: " + licensees.get(licenseNumber) + ", License Number: " + licenseNumber;
        } else {
            return "Licensee not found!";
        }
    }
}
