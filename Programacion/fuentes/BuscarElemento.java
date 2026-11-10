import java.util.Scanner;

public class BuscarElemento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums1 = new int[5];

        for (int i=0;i<nums1.length;i++){
            System.out.print("numero a añadir: ");
            nums1[i]=sc.nextInt();
            System.out.println("");
        }

        System.out.print("numero a comprobar: ");
        int comp = sc.nextInt();

        for (int i=0;i<nums1.length;i++){
            if (nums1[i]==comp){
                System.out.println("El numero "+comp+
                " esta en la posicion del array: "+i);
            }
        }

        sc.close();
    }
}
