import java.util.Scanner;

public class Nombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombre = new String[3];

        for (int i=0;i<nombre.length;i++){
            System.out.print("nombre a añadir: ");
            nombre[i]=sc.nextLine();
            System.out.println("");
        }

        for (int i=0;i<nombre.length;i++){
            System.out.println("nombre: "+nombre[i]+
            " posicion en el array: "+i);
        }

        sc.close();
    }
}
