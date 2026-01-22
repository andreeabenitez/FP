package separar;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();


        String[] palabras = frase.split(" ");

        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        sc.close();

    }
}
