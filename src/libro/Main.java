package libro;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Libro> inventario = new ArrayList<>();


        String entrada;
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar nuevo libro");
            System.out.println("2. Mostrar todos los libros");
            System.out.println("3. Buscar libro por título");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            entrada = sc.nextLine();

            try {
                opcion = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                opcion = -1;
            }

            if (opcion == 1) {

                System.out.print("Título: ");
                String titulo = sc.nextLine();

                System.out.print("Autor: ");
                String autor = sc.nextLine();

                int anio;
                do {
                    System.out.print("Año de publicación: ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Debe ser un número.");
                        sc.next();
                    }
                    anio = sc.nextInt();
                } while (anio <= 0);

                double precio;
                do {
                    System.out.print("Precio: ");
                    while (!sc.hasNextDouble()) {
                        System.out.println("Debe ser un número.");
                        sc.next();
                    }
                    precio = sc.nextDouble();
                } while (precio <= 0);

                sc.nextLine();

                inventario.add(new Libro(titulo, autor, anio, precio));
                System.out.println("Libro.Libro agregado correctamente.");

            } else if (opcion == 2) {

                if (inventario.isEmpty()) {
                    System.out.println("No hay libros en el inventario.");
                } else {
                    for (int i = 0; i < inventario.size(); i++) {
                        inventario.get(i).mostrarInfo();
                    }
                }

            } else if (opcion == 3) {

                System.out.print("Introduce el título a buscar: ");
                String buscar = sc.nextLine();

                int i = 0;
                boolean encontrado = false;

                while ( i < inventario.size()){
                    if (inventario.get(i).getTitulo().equalsIgnoreCase(buscar)) {
                        inventario.get(i).mostrarInfo();
                        encontrado = true;
                        break;
                    }
                    i++;
                }

                if (!encontrado) {
                    System.out.println("El libro no está en el inventario.");
                }

            } else if (opcion == 4) {

                System.out.println("Saliendo del programa...");

            } else {
                System.out.println("Opción no válida.");
            }
        }  while (opcion != 4) ;
        sc.close();
    }
}





