import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int num1,num2;
        int suma;
        int resta;
        int multi;
        double divi;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        num1=sc.nextInt();
        sc.nextLine();
        System.out.print("ingrese el segundo numero: ");
        num2=sc.nextInt();
        sc.nextLine();

        System.out.println("que operacion desea hacer:");
        System.out.println("suma: 1");
        System.out.println("resta: 2");
        System.out.println("multiplicacion: 3");
        System.out.println("division: 4");
        int operacion=sc.nextInt();
        sc.nextLine();

        switch (operacion) {
            case 1:
                suma=num1+num2;
                System.out.println("Suma: "+suma);
            break;

            case 2:
                resta=num1-num2;
                System.out.println("resta: "+resta);
            break;

            case 3:
                multi=num1*num2;
                System.out.println("multiplicacion: "+multi);
            break;

            case 4:
                if (num2==0) {
                    System.out.println("no se puede divedir entre 0");
                }else{
                    divi=(double)num1/num2;

                    System.out.println("division: "+divi);
                }
            break;

            default:
                System.out.println("opcion no valida");
            break;
        }
        sc.close();
    }
}
