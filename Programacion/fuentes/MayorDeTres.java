import java.util.Scanner;

public class MayorDeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double max = 0,med = 0,min = 0;

        System.out.println("numero 1: ");
        double num1=sc.nextDouble();
        System.out.println("numero 2: ");
        double num2=sc.nextDouble();
        System.out.println("numero 3: ");
        double num3=sc.nextDouble();

        if (num1>=num2&&num1>=num3) {
            max=num1;
            if (num2>=num3) {
                med=num2;
                min=num3;
            }else{
                med=num3;
                min=num2;
            }
        }else if (num2>=num1&&num2>=num3) {
            max=num2;
            if (num1>=num3) {
                med=num1;
                min=num3;
            }else{
                med=num3;
                min=num1;
            }
        }else if (num3>=num1&&num3>=num2) {
            max=num3;
            if (num1>=num2) {
                med=num1;
                min=num2;
            }else{
                med=num2;
                min=num1;
            }
        }
        System.out.println("el numero mayor es: " + max);
        System.out.println("orden mayor a menor: " + max + ", " +med+ ", " + min);
        sc.close();
    }
}
