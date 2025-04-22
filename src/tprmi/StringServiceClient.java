package tprmi;
import java.rmi.Naming;

public class StringServiceClient {
    public static void main(String[] args) {
        try {
            StringService service = (StringService) Naming.lookup("//localhost/StringService");
            // System.out.println(service.reverseString("Hello"));
            System.out.println(service.reverseString("Hello"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
