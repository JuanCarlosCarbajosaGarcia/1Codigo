import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 =0,num2=1,max = 0,contador=1;

        System.out.print("orden: ");
        int orden=sc.nextInt();

        for(int i=2;i<orden;i++){
            System.out.println(max);
            max=num1+num2;
            num1=num2;
            num2=max;
            contador=i+1;
        }
        System.out.println("posicion en la secuencia: "+contador);
        System.out.println("numero: "+max);

        sc.close();
    }
}
