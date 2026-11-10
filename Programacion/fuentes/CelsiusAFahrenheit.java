import java.util.Scanner;

public class CelsiusAFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsi;
        double fahre;

        System.out.println("introduzca temperatura en Cº: ");
        celsi=sc.nextDouble();

        fahre=(celsi*9/5)+32;

        System.out.println("Celsius: "+ celsi +"Cº. es igual a fahrenheit: " + fahre+"Fº");
        sc.close();
    }
}
