package string;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa una cadena de texto ");
        String cadena = sc.nextLine();


        System.out.println(cadena.substring(0, cadena.length() / 2));
        System.out.println(cadena.charAt(cadena.length() - 1));
        System.out.println(new StringBuilder(cadena).reverse().toString());
        System.out.println(String.join("-", cadena.split("")));


        for (char c : cadena.toLowerCase().toCharArray()) {
            if ("aeiouáéíóú".indexOf(c) != -1) {
                System.out.print(c + " ");
            }
        }
        sc.close();

    }
}
