import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;

        System.out.print("introduzca un numero: ");
        int num=sc.nextInt();

        for (i=1;i<=num;i++){
            if (num%i==0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
