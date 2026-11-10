

import java.util.Scanner;

public class VocalMayuscula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce vocal: ");
        char vocal = sc.next().charAt(0);

        vocal = Character.toLowerCase(vocal);

        if (vocal == 'a'||vocal=='e'||vocal=='i'||
            vocal=='o'||vocal=='u') {
            
            System.out.println("La vocal en Mayuscula es: "
                + Character.toUpperCase(vocal));
        }else {
            System.out.println("El caracter introducido no es vocal");
        }
        sc.close();
    }
}
