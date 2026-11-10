import java.util.Scanner;

public class DiasMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.print("introduzca numero de mes: ");
        opcion=sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("enero");
                break;
            case 2:
                System.out.print("febrero");
                break;
            case 3:
                System.out.print("marzo");
                break;
            case 4:
                System.out.print("abril");
                break;
            case 5:
                System.out.print("mayo");
                break;
            case 6:
                System.out.print("junio");
                break;
            case 7:
                System.out.print("julio");
                break;
            case 8:
                System.out.print("agosto");
                break;
            case 9:
                System.out.print("septiembre");
                break;
            case 10:
                System.out.print("Octubre");
                break;
            case 11:
                System.out.print("noviembre");
                break;
            case 12:
                System.out.print("diciembre");
                break;
            default:
                System.out.print("numero no valido");
                break;
        }
        switch (opcion) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(" tiene: 31 dias");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(" tiene: 30 dias");
                break;
            case 2:
                System.out.println(" tiene: 28 dias");
                break;
            default:
                break;
        }

        sc.close();
    }
}
