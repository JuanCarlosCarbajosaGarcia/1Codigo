import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums1 = {1,2,3,4,5};

        /*
        int[] nums1 = new int[5];
        for (int i=0;i<nums1.length;i++){
            System.out.print("numero a añadir: ");
            nums1[i]=sc.nextInt();
            System.out.println("");
        }
        */

        System.out.print("El contenido del array es: ");
        for (int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]+" ");
        }
        System.out.println("");
        System.out.print("El contenido del array invertido es: ");
        for (int i=nums1.length-1;i>=0;i--){
            System.out.print(nums1[i]+" ");
        }
        int[][] nums2 = {{3,6,9},{2,4,6},{1,3,5}};

        System.out.println();
        System.out.print("numero a comprobar: ");
        int soli = sc.nextInt();
        boolean esta=false;
        int veces=0;

        System.out.println("el contenido del array es:");

        for(int fila = 0;fila<nums2.length;fila++){
            for(int columna=0;columna<nums2[fila].length;columna++){
                System.out.print(nums2[fila][columna]+" ");
                if (nums2[fila][columna]==soli) {
                    esta = true;
                    veces++;
                }
            }
            System.out.println();
        }

        if (esta&&veces==1) {
            System.out.println("el numero: "+soli+" esta y aparece "+ veces+" vez");
        }else if (esta&&veces>1) {
            System.out.println("el numero: "+soli+" esta y aparece "+veces+ " veces");
        }else{
            System.out.println("el numero no existe");
        }

        //int diagP[];
        for(int fila = 0;fila<nums2.length;fila++){
            for(int columna=0;columna<nums2[fila].length;columna++){
                if (fila==columna) {
                    System.out.print(nums2[fila][columna]+" ");
                }
            }
        }
        System.out.println("diagonal principal ");

        sc.close();
    }
}
