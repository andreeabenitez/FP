package practicasbucles;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            // Ejercicios practicos bucles
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa un número:");
            int pares = sc.nextInt();

            for (int i = 2; i < pares; i += 2) {
                System.out.println(i);
            }

            sc.close();
        }

    }



/*


        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número:");
        int numeros = sc.nextInt();


        for (int i = numeros; i >= 0; i--) {
                System.out.print(i + ", ");
        }

        sc.close();
    }
}

 */

/*

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            if (i < n) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }

        sc.close();
    }
}

 */



        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número:");
        int numeros = sc.nextInt();


        for (int i = 1; i <= 10; i++) {
            int multiplicar = i * numeros;

            System.out.println(multiplicar);
        }
        sc.close();

    }
}

         */


        /*

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número:");
        int numeros = sc.nextInt();


        for (int i = 1; i <= numeros; i++) {
            System.out.println(i);
        }

        }
    }

         */

        /*

        for (int a = 0; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 0; d <= 9; d++) {
                        for (int e = 0; e <= 9; e++) {

                            System.out.println(
                                    convertir(a) + "-" +
                                            convertir(b) + "-" +
                                            convertir(c) + "-" +
                                            convertir(d) + "-" +
                                            convertir(e)
                            );
                        }
                    }
                }
            }
        }
    }

    public static String convertir(int numero) {
        if (numero == 3) {
            return "E";
        } else {
            return String.valueOf(numero);
        }
    }
}



         */

        /*


        for (int i = 1; i < 10 ; i++) {
            System.out.println("Tabla del " + i);
            for (int j = 0; j < 10; j++) {
                System.out.println(i * j);

            }
        }

        }
    }

         */

        /*
        Scanner sc = new Scanner(System.in);

        int nota;

        int aprobados = 0;
        int condicionados = 0;
        int suspensos = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Introduce la nota del alumno " + i + ": ");
            nota = sc.nextInt();

            if (nota >= 5) {
                aprobados++;
            } else if (nota == 4) {
                condicionados++;
            } else {
                suspensos++;
            }
        }

        System.out.println("Alumnos aprobados: " + aprobados);
        System.out.println("Alumnos condicionados: " + condicionados);
        System.out.println("Alumnos suspensos: " + suspensos);

        sc.close();
    }
}

         */
        /*

        Scanner sc = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Introduce un número entre 0 y 10: ");
            numero = sc.nextInt();
        } while (numero < 0 || numero > 10);

        System.out.println("Tabla de multiplicar del " + numero + ":");

        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        sc.close();
    }
}


         */



        /*
        Scanner sc = new Scanner(System.in);

        int edad;
        double altura;

        int sumaEdades = 0;
        double sumaAlturas = 0;

        int mayores18 = 0;
        int mas175 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Alumno " + i);

            System.out.print("Introduce la edad: ");
            edad = sc.nextInt();

            System.out.print("Introduce la altura (en metros): ");
            altura = sc.nextDouble();

            sumaEdades += edad;
            sumaAlturas += altura;

            if (edad > 18) {
                mayores18++;
            }

            if (altura > 1.75) {
                mas175++;
            }
        }

        double mediaEdad = (double) sumaEdades / 5;
        double mediaAltura = sumaAlturas / 5;

        System.out.println("Edad media: " + mediaEdad);
        System.out.println("Altura media: " + mediaAltura);
        System.out.println("Alumnos mayores de 18 años: " + mayores18);
        System.out.println("Alumnos que miden más de 1.75 m: " + mas175);

        sc.close();
    }
    }

         */
        /*

        Scanner sc = new Scanner(System.in);

        int numero;

        int sumaPositivos = 0;
        int sumaNegativos = 0;

        int contPositivos = 0;
        int contNegativos = 0;
        int contCeros = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce el número " + i + ": ");
            numero = sc.nextInt();

            if (numero > 0) {
                sumaPositivos += numero;
                contPositivos++;
            } else if (numero < 0) {
                sumaNegativos += numero;
                contNegativos++;
            } else {
                contCeros++;
            }
        }

        if (contPositivos > 0) {
            System.out.println("Media de positivos: " +
                    (double) sumaPositivos / contPositivos);
        } else {
            System.out.println("No se introdujeron números positivos");
        }

        if (contNegativos > 0) {
            System.out.println("Media de negativos: " +
                    (double) sumaNegativos / contNegativos);
        } else {
            System.out.println("No se introdujeron números negativos");
        }

        System.out.println("Cantidad de ceros: " + contCeros);

        sc.close();
    }
}

         */


        /*
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("El factorial no existe para números negativos");
        } else {
            long factorial = 1;

            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            System.out.println("El factorial de " + n + " es: " + factorial);
        }

        sc.close();
    }
}

         */



        /*

        for (int i = 100; i >= 0; i -= 7) {
            System.out.println(i);
                }

            }
        }


         */

        /*
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n = sc.nextInt();

        if (n >= 1) {
            for (int i = 1; i <= n; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("El número debe ser mayor o igual que 1");
        }

        sc.close();
    }
}

         */

        /*
        Scanner sc = new Scanner(System.in);
        int n;
        int suma = 0;
        int contador = 0;

        do {
            System.out.print("Introduce un número");
            n = sc.nextInt();
            suma += n;
            contador ++;

        } while (n >= 0);

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("La media de los números positivos es: " + media);
        } else {
            System.out.println("No se introdujeron números positivos");
        }

        sc.close();
    }
}

         */

        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número a adivinar");
        int n = sc.nextInt();
        int adivinar;

        do {

            System.out.println("Adivina el número");
            adivinar = sc.nextInt();

            if(n < adivinar) {
                System.out.println("El número es más bajo");
            } else if (n > adivinar) {
                System.out.println("El numero es mayor");
            } else {
                System.out.println("Adivinaste el número");
            }
            }
        while (n != adivinar);
    }

    }

         */

        /*
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un número (0 para salir): ");
            numero = sc.nextInt();

            if (numero != 0) {
                if (numero % 2 == 0) {
                    System.out.println("Es par");
                } else {
                    System.out.println("Es impar");
                }
            }

        } while (numero != 0);

        System.out.println("Programa terminado");
        sc.close();
    }
}


         */

        /*
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un número (0 para salir): ");
            numero = sc.nextInt();

            if (numero > 0) {
                System.out.println("Es positivo");
            } else if (numero < 0) {
                System.out.println("Es negativo");
            }

        } while (numero != 0);

        System.out.println("Programa terminado");
        sc.close();
    }
}

         */

        /*

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una nota (0 a 10): ");
        int nota = sc.nextInt();
        if (nota < 0 || nota > 10) {
            System.out.println("Nota no válida");
        } else if (nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota < 6) {
            System.out.println("Suficiente");
        } else if (nota < 7) {
            System.out.println("Bien");
        } else if (nota < 9) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }

        sc.close();
            }
        }

         */

/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tres números");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            if (b >= c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        } else if (b >= a && b >= c) {
            if (a >= c) {
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        } else {
            if (a >= b) {
                System.out.println(c + " " + a + " " + b);
            } else {
                System.out.println(c + " " + b + " " + a);
            }
        }

        sc.close();
    }
}

 */

        /*

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos números");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        if (numero1 > numero2) {
            System.out.println("El mayor es el primer número: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("El mayor es el segundo número: " + numero2);
        } else {
            System.out.println("Los dos números son iguales");
        }

        sc.close();
    }
}

         */

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos números");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        if (numero1 % numero2 == 0) {
            System.out.println("Es múltiplo");
        } else {
            System.out.println("No es múltiplo");
        }

        sc.close();

    }


    }

         */

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");

        int numero = sc.nextInt();

        if (numero >= 0) {
            System.out.println("Es positivo");
        } else {
            System.out.println("Es negativo");
        }
        sc.close();

    }
}

         */





     /*  Scanner sc = new Scanner(System.in);
        System.out.println("Número de día de la semana");
        int dia = sc.nextInt();

        if (dia == 1) {
            System.out.println("Lunes");
        } else if (dia == 2) {
            System.out.println("Martes");
        } else if (dia == 3) {
            System.out.println("Miércoles");
        } else if (dia == 4) {
            System.out.println("Jueves");
        } else if (dia == 5) {
            System.out.println("Viernes");
        } else if (dia == 6) {
            System.out.println("Sábado");
        } else if (dia == 7) {
            System.out.println("Domingo");
        } else {
            System.out.println("Número incorrecto");
        }

        sc.close();
    }
}

      */

/*
import java.util.Scanner;

public class Libro.Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número de día de la semana");
        int dia = sc.nextInt();

        switch(dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número incorrecto");
        }

        sc.close();
    }
}


 */

