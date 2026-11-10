import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[5];
        int suma=0;

        for(int i=0;i<nums.length;i++){
            System.out.print("numeros del array: ");
            nums[i]=sc.nextInt();
            System.out.println("");
        }

        for(int i=0;i<nums.length;i++){
            suma=suma+nums[i];
        }
        System.out.println("Suma: "+suma);

        sc.close();
    }
}
