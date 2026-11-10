import java.util.Scanner;

public class DibujaTriangulos {

    int altura;

    public void dibujarTrianguloIzquierda(){
        System.out.println("Triangulo alineado a la izquierda");
        for(int i=1;i<=this.altura;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    } 
    public void dibujarTrianguloDerecha(){
        System.out.println("Triangulo alineado a la Derecha");
        for(int i=1;i<=this.altura;i++){
            for (int j=1;j<=this.altura-i;j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public void dibujarTrianguloCentrado(){
        int posiciones = altura*2-1;

        for(int i = 0; i<altura; i++){
            for (int j = 0; j<posiciones; j++){
                if(j >= (posiciones / 2 - i) && j <= (posiciones / 2 + i)){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public void dibujarTrianguloCentradoN(){
    for (int fila = 1; fila <= altura; fila++) {

            // Espacios iniciales
            for (int espacio = 1; espacio <= this.altura - fila; espacio++) {
                System.out.print(" ");
            }

            if (fila == 1) {
                System.out.println("O");
            } else {
                System.out.print("O");

                // Interior del triángulo
                for (int i = 1; i <= (2 * fila - 3); i++) {
                    System.out.print("*");
                }

                System.out.println("O");
            }
        }
    }
    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in);

        DibujaTriangulos triangulo1 = new DibujaTriangulos();
        System.out.println("Cuanto quieres que mida:");
        triangulo1.altura = scanner.nextInt();
        triangulo1.dibujarTrianguloIzquierda();
        triangulo1.dibujarTrianguloDerecha();
        triangulo1.dibujarTrianguloCentrado();
        triangulo1.dibujarTrianguloCentradoN();

        scanner.close();
    } 
}
