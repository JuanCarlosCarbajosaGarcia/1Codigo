import java.time.LocalDate;
import java.util.Scanner;

public class EdadCien {
    public static void main(String[] args) {
        int ano;
        int anoActu = LocalDate.now().getYear();

        Scanner sc = new Scanner(System.in);

        System.out.print("introduce tu año de nacimiento: ");
        ano = sc.nextInt();

        int tienes = anoActu-ano;
        int faltan = 100-tienes;

        if (anoActu-ano>=100) {
            System.out.println("felicidades centenario");
        }else{
            System.out.println("Te faltan: "+faltan+" año/s");
        }


        /*
        int mayor=0;

        if (tienes>=100) {
            mayor = 1;
        }

        switch (mayor) {
            case 1:
                System.out.println("felicidades centenario");
                break;
        
            default:
                System.out.println("Te faltan: "+faltan+" año/s");
                break;
        }
        */
        /*
        int actu;
        System.out.print("introduce el año actual: ");
        actu= sc.nextInt();
        
        int tiene = actu-ano;
        int falta = 100-tiene;

        if (actu-ano>=100) {
            System.out.println("felicidades centenario");
        }else{
            System.out.println("Te faltan: "+falta+" año/s");
        }
        */

        sc.close();
    }
}
