

import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("introduce un numero: ");
        num = sc.nextInt();

        if (num==2) {
            System.out.println("es primo");
        }else if (num%2==0) {
            System.out.println("no es primo");
        }else{
            System.out.println("es primo");
        }
        sc.close();
    }
}
