public class EjercicioNuevo {
    public static void main(String[] args) {
        /*
        mostrar la suma de los numeros 
        multiplos de tres o multiplos de 5 
        que hay hasta el 256
        */

        int i=0;
        int suma=0;

        while (i<=256) {
            if (i%3==0||i%5==0) {
                suma=suma+i;
                //System.out.println(i);
            }
            i++;
        }
        System.out.println("suma: "+suma);
    }
}
