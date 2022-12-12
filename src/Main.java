import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        while(!false) {
            Scanner valami = new Scanner(System.in);
            String valami2 = valami.nextLine();

            if (Objects.equals(valami2, "hello"))
            {
                System.out.println("Hello World");
            }
            else if (Objects.equals(valami2, "info"))
            {
                System.out.println("v1");
            }
            else if (Objects.equals(valami2, "exit"))
            {
                System.out.println("Adiós");
            }
        }
    }
}