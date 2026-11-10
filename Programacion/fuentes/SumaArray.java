

import java.util.Scanner;

public class SumaArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma=0;
        int result=0;

        System.out.println("dimension array: ");
        int[][] numeros = new int[2][5];

        for(int fila=0;fila<numeros.length;fila++){
            for(int colum=0;colum<numeros[fila].length;colum++){
                System.out.println("Valor:");
                numeros[fila][colum]=sc.nextInt();
            }
        }

        System.out.println("numeros del array");
        for(int fila=0;fila<numeros.length;fila++){
            for(int colum=0;colum<numeros[fila].length;colum++){
                System.out.print(numeros[fila][colum]+", ");
            }
            System.out.println("");
        }

        for(int fila=0;fila<numeros.length;fila++){
            for(int colum=0;colum<numeros[fila].length;colum++){
                suma=suma+numeros[fila][colum];
            }
        }
        result=suma;

        System.out.println("");
        System.out.println("La suma de elementos del array es: "+result);

        sc.close();
    }
}
