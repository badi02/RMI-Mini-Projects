package tprmi;

// Importation des classes nécessaires pour le fonctionnement de RMI (Remote Method Invocation)
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// La classe Hello implémente l'interface distante HelloInterface et hérite de UnicastRemoteObject
public class Hello extends UnicastRemoteObject implements HelloInterface {
    // Constante pour assurer la compatibilité lors de la désérialisation
    private static final long serialVersionUID = 1L;

    // Variable pour stocker un message
    private String message;

    // Compteur pour suivre le nombre d'appels à la méthode `say`
    private int counter = 0;

    // Constructeur protégé sans arguments, nécessaire pour la sérialisation
    protected Hello() throws RemoteException {
        // Appel du constructeur de la classe parente (UnicastRemoteObject)
        super();
    }

    // Constructeur avec un argument pour initialiser le message
    public Hello(String msg) throws RemoteException {
        // Initialisation du message avec le contenu passé en argument
        message = msg;
    }

    // Implémentation de la méthode distante définie dans l'interface HelloInterface
    @Override
    public String say() throws RemoteException {
        // Incrémente le compteur à chaque appel
        counter++;
        // Retourne le message concaténé avec le nombre d'appels
        return message + " " + counter;
    }
}
