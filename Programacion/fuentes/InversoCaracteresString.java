import java.util.Scanner;

public class InversoCaracteresString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String normal;
        String inverso="";

        System.out.print("palabra a invertir: ");
        normal = sc.nextLine();

        for(int i = normal.length()-1;i>=0;i--){
            char letra=normal.charAt(i);
            inverso=(inverso+letra);
        }

        System.out.println("palabra incertida: "+inverso);

        sc.close();
    }
}
