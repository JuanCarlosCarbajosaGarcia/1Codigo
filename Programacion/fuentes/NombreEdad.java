import java.util.Scanner;

public class NombreEdad {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    
        System.out.println("Introduzca su nombre: ");
        String nombre = sc.nextLine();
    
        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();
    
        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");
        sc.close();
    }
}
