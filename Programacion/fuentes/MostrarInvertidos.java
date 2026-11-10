import java.util.Scanner;

public class MostrarInvertidos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums1 = new int[5];

        for (int i=0;i<nums1.length;i++){
            System.out.print("numero a añadir: ");
            nums1[i]=sc.nextInt();
            System.out.println("");
        }

        System.out.print("El contenido del array invertido es: ");
        for (int i=nums1.length-1;i>=0;i--){
            System.out.print(nums1[i]+" ");
        }

        sc.close();
    }
}
