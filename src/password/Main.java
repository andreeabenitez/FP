package password;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la contraseña: ");
        String password = sc.nextLine();

        if (password.length() > 25) {
            System.out.println("Contraseña demasiado larga");
            return;
        }

        if (password.matches(".*[@.$#&/].*")) {
            System.out.println("La contraseña contiene caracteres no permitidos");
            return;
        }


        char primera = password.charAt(0);
        char ultima = password.charAt(password.length() - 1);

        if (!Character.isUpperCase(primera) || !Character.isUpperCase(ultima)) {
            System.out.println("Error: la primera y la última letra deben estar en mayúsculas");
            return;
        }

        System.out.println("Contraseña almacenada correctamente " );
        sc.close();


    }
}
