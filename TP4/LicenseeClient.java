package TP4;
import java.rmi.Naming;

public class LicenseeClient {
    public static void main(String[] args) {
        try {
            // Recherche du service dans le registre RMI
            LicenseeService service = (LicenseeService) Naming.lookup("//localhost/LicenseeService");

            // Ajouter un licencié
            service.addLicensee("Alice Dupont", "12345");

            // Afficher les informations d'un licencié
            String info = service.getLicenseeInfo("12345");
            System.out.println(info);

            // Mettre à jour un licencié
            service.updateLicensee("12345", "Alice Dupont", "67890");

            // Supprimer un licencié
            service.removeLicensee("67890");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
