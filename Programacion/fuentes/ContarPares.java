import java.util.Scanner;

public class ContarPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[5];
        int pares=0;

        for(int i=0;i<nums.length;i++){
            System.out.print("numeros del array: ");
            nums[i]=sc.nextInt();
            System.out.println("");
        }

        for(int i=0;i<nums.length;i++){
            if (nums[i]%2==0&&nums[i]!=0) {
                pares++;
            }
        }

        System.out.println("numeros pares: "+pares);

        sc.close();
    }
}
