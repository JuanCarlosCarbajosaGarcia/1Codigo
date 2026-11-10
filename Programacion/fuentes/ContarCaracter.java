import java.util.Scanner;

public class ContarCaracter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String cadena;
        String caracter;
        int contarVecesCaracter=0;

        System.out.println("cadena a revisar:");
        cadena = sc.nextLine();
        cadena.toLowerCase();

        System.out.println("caracter a contar: ");
        caracter = sc.nextLine();
        caracter.toLowerCase();
        char comprobar = caracter.charAt(0);

        for(int i=0;i<cadena.length();i++){
            char asig = cadena.charAt(i);

            if (asig==comprobar) {
                contarVecesCaracter++;
            }
        }

        if (contarVecesCaracter>1) {
            System.out.println("caracter: " + caracter + ", esta: "
                            + contarVecesCaracter+" veces");    
        }else if (contarVecesCaracter==1) {
            System.out.println("caracter: " + caracter + ", esta: "
                            + contarVecesCaracter+" vez");
        }else{
            System.out.println("El caracter: "+caracter+"no esta");
        }

        
        sc.close();
    }
}
