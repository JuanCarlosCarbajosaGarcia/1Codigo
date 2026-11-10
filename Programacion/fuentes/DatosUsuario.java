import java.util.InputMismatchException;
import java.util.Scanner;
 
public class DatosUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad = 0;
        double altura = 0.0;
        boolean entradaValida = false;        
 

        System.out.print("Nombre completo: ");
        String nombreCompleto = scanner.nextLine();
 
        // Leer edad
        while (!entradaValida) {
            System.out.print("Introduce tu edad: ");
 
            try {
                edad = scanner.nextInt();
                entradaValida = true;            
            } 
            catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, introduce un número entero.");
                scanner.nextLine(); // Limpiar el buffer
            }
        }
 
        // Leer altura
        entradaValida = false;
        while (!entradaValida) {
            System.out.print("Introduce tu altura: ");
            try {
                altura = scanner.nextDouble();
                entradaValida = true;            
            } 
            catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, introduce una altura correcta.");
                scanner.nextLine(); // Limpiar el buffer
            }
        }
 
        // Leer si estudia actualmente
        System.out.print("¿Estudias actualmente? (true/false): ");
        boolean estudia = scanner.nextBoolean();
 
        // Mostrar los datos con formato
        System.out.printf("\nNombre: %s\n", nombreCompleto.toUpperCase());
        System.out.printf("Edad: %d años\n", edad);
        System.out.printf("Altura: %.2f metros\n", altura);
        if (estudia){
            System.out.printf("Estudia");
        }
        else{
            System.out.printf("No Estudia");
        }
 
        scanner.close();
    }
}
/*
import java.util.Scanner;

public class DatosUsuario {
    public static void main(String[] args) {
        String nombre;
        int edad;
        int altura;
        boolean estudia;
        int opcion;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca los datos del usuario");
        System.out.print("Nombre completo: ");
        nombre = sc.nextLine();
        System.out.print("Edad: ");
        edad = sc.nextInt();
        System.out.print("Altura(cm): ");
        altura = sc.nextInt();
        System.out.println("estudia: ");
        System.out.println("1: si");
        System.out.println("2: no");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                estudia = true;
                break;
            case 2:
                estudia = false;
                break;
            default:
                System.out.println("opcion no valida");
                System.out.println("valor por defecto no");
                estudia = false;
                break;
        }

        System.out.printf("Nombre: %s%n Edad: %d años%n" + 
                        "Altura: %d cm%n Estudia: %s%n", 
                        nombre, edad, altura, estudia);
        sc.close();
    }
}
*/