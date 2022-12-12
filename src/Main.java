import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        while(!false) {
            Scanner valami = new Scanner(System.in);
            String valami2 = valami.nextLine();

            if (Objects.equals(valami2, "hello"))
            {
                System.out.println("Hello World!!!");
            }
            else if (Objects.equals(valami2, "info"))
            {
                System.out.println("v2");
            }
            else if (Objects.equals(valami2, "exit"))
            {
                System.out.println("Adiós");
            }
            else if (Objects.equals(valami2, "help"))
            {
                System.out.println("A parancsok listája:");
                System.out.println("hello");
                System.out.println("info");
                System.out.println("exit");
                System.out.println("help");
            }
        }
    }
}