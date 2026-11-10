

public class NumerosDel1Al10W {
    public static void main(String[] args) {
        int i = 1;
        int suma = 0;
        
        while (i<=10) {
            System.out.print(i +"-");
            /*if (i %2==0) {
                System.out.print(i + " ");
            }
            */

            suma=suma+i;

            i++;
        }
        System.out.println("->"+suma);
    }
}
