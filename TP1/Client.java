package TP1;
import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            Hello hello = (Hello) Naming.lookup("//localhost/Hello");
            System.out.println(hello.sayHello());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

