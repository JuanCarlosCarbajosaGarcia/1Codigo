

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("numero entero a comprobar: ");
        int num=sc.nextInt();

        
        if (num==0) {
            System.out.println("El numero es cero");
        }else{
            if (num%2==0) {
            System.out.println("El numero es par");
            }else{
            System.out.println("El numero es impar");
            }
        }
        

        
        if (num==0) {
            System.out.println("El numero es cero");
        }else{
            if (num%5==0) {
            System.out.println("El numero es multiplo de 5");
            }else{
            System.out.println("El numero no es multiplo de 5");
            }
        }
        

        
        if (num==0) {
            System.out.println("El numero es cero");
        }else{
            if (num%5==0&&num%3==0) {
            System.out.println("El numero es multiplo de 3 y 5");
            }else{
            System.out.println("El numero no es multiplo de 3 y 5");
            }
        }
        

        if (num==0) {
            System.out.println("El numero es cero");
        }else{
            if (num%5==0&&num%3==0) {
            System.out.println("El numero es multiplo de 3 y 5");
            }else if (num%5==0) {
                System.out.println("El numero es multiplo de 5");
            }else if (num%3==0) {
                System.out.println("El numero es multiplo de 3");
            }else{
                System.out.println("El numero no es multiplo de 3 o 5");
            }
        }

        sc.close();
    }
}
