

import java.util.Scanner;

public class PromedioTresNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double promedio;

        System.out.println("numero 1: ");
        double num1=sc.nextDouble();

        System.out.println("numero 2: ");
        double num2=sc.nextDouble();

        System.out.println("numero 3: ");
        double num3=sc.nextDouble();

        promedio=(num1+num2+num3)/3;
        System.out.println("El promedio de " + num1 +", "
        +num2+", "+num3+", es: " + promedio);
        sc.close();
    }
}
