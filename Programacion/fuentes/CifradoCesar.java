import java.util.Scanner;

public class CifradoCesar {

    // Array con las letras del alfabeto
    public static char[] letras = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
            'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
            'U', 'V', 'W', 'X', 'Y', 'Z'
    };

    // Método para cifrar
    public static String cifrar(String texto, int salto) {

        String resultado = "";

        for (int i = 0; i < texto.length(); i++) {

            char letra = texto.charAt(i);

            for (int j = 0; j < letras.length; j++) {

                if (letra == letras[j]) {
                    resultado += letras[(j + salto) % 26];
                    break;
                }

            }
        }

        return resultado;
    }

    // Método para descifrar
    public static String descifrar(String texto, int salto) {

        String resultado = "";

        for (int i = 0; i < texto.length(); i++) {

            char letra = texto.charAt(i);

            for (int j = 0; j < letras.length; j++) {

                if (letra == letras[j]) {
                    resultado += letras[(j - salto + 26) % 26];
                    break;
                }

            }
        }

        return resultado;
    }

    // Método principal
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el mensaje (en mayúsculas): ");
        String mensaje = teclado.nextLine().toUpperCase();

        System.out.print("Introduce el salto: ");
        int salto = teclado.nextInt();

        String mensajeCifrado = cifrar(mensaje, salto);
        System.out.println("Mensaje cifrado: " + mensajeCifrado);

        String mensajeDescifrado = descifrar(mensajeCifrado, salto);
        System.out.println("Mensaje descifrado: " + mensajeDescifrado);

        teclado.close();
    }
}