

import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma=0;
        int num;
        boolean nega=false;
        System.out.println("introduzca un numero negativo para salir");

        do {
            System.out.print("introduzca un numero: ");
            num=sc.nextInt();
            if (num>=0) {
                suma=suma+num;
            }else{
                nega=true;
            }
        } while (nega==false);

        System.out.println("suma total: "+suma);
        sc.close();
    }
}
