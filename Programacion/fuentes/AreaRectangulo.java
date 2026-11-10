import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        double base;
        double altura;
        double area;

        Scanner sc = new Scanner(System.in);

        System.out.println("introduzca la base: ");
        base=sc.nextDouble();
        System.out.println("introduzca la altura: ");
        altura=sc.nextDouble();

        area=(base*altura);
        System.out.println("Area: " + area);

        sc.close();
    }
}
