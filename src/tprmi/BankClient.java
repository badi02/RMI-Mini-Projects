package tprmi;
import java.rmi.Naming;

public class BankClient {
    public static void main(String[] args) {
        try {
            BankAccount bankAccount = (BankAccount) Naming.lookup("//localhost/BankAccount");
            bankAccount.deposit(100);
            bankAccount.withdraw(50);
            System.out.println("Balance: " + bankAccount.getBalance());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
