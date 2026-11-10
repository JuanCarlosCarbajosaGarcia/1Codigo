

public class NumerosDel1Al10D {
    public static void main(String[] args) {
        int i = 1;
        int suma = 0;
        
        do{
            System.out.print(i +"-");

            suma=suma+i;

            i++;
        }while (i<=10);
        System.out.println();
        System.out.println("suma: "+suma);
    }
}
