import java.util.Scanner;

public class EncontrarMaximo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums1 = new int[5];
        int max=0;
        int conta=0;
        
        for (int i=0;i<nums1.length;i++){
            System.out.print("numero a añadir: ");
            nums1[i]=sc.nextInt();
            System.out.println("");
        }

        for (int i=0;i<nums1.length;i++){
            if (nums1[i]>max) {
                max=nums1[i];
                conta=i;
            }
        }

        System.out.println("maximo: "+max+
            " posicion en el array: "+conta);
        
        sc.close();
    }
}
