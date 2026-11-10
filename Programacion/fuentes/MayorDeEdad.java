import java.time.LocalDate;
import java.util.Scanner;

public class MayorDeEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean mayor=false;
        int anoActual = LocalDate.now().getYear();

        System.out.print("escriba el año de nacimiento: ");
        int ano=sc.nextInt();
        sc.nextLine();

        System.out.print("Pais: ");
        String pais = sc.nextLine();
        pais.toLowerCase();

        if (anoActual-ano>=17 && pais=="irlanda"||pais=="chipre") {
            mayor=true;
        }else if (anoActual-ano>=18 && pais=="españa"||pais=="alemania"||pais=="malta") {
            mayor=true;
        }else if (anoActual-ano>=16 && pais=="belgica"||pais=="bélgica"||pais=="finlandia"
                    ||pais=="noruega"||pais=="luxemburgo"||pais=="escocia") {
            mayor=true;
        }

        //belgica,bélgica,finlandia,noruega,luxemburgo,escocia 16
        //irlanda,chipre 17
        //españa,alemania,malta 18

        System.out.println("año actual: " + anoActual);
        System.out.println("año nacimiento: " + ano);
        System.out.println("edad: " + (anoActual-ano));
        System.out.println("Pais: " + pais);
        System.out.println("mayor de edad: " + mayor);
        sc.close();
    }
}
