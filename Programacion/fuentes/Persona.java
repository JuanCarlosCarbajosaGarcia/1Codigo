

import java.util.Scanner;

public class Persona {
    String nombre;
    int edad;

    public void saludar(String mensaje){
        System.out.println("Hola, soy "+this.nombre+
                            " y tengo "+this.edad+" años.");
        System.out.println(mensaje);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Persona[] personas = new Persona[3];
        String[] mensajes = new String[3];

        for (int i =0;i<3;i++){
            personas[i] = new Persona();
            System.out.print("nombre "+(i+1)+": ");
            personas[i].nombre = sc.nextLine();
            System.out.println("");
            System.out.print("edad "+(i+1)+": ");
            personas[i].edad = sc.nextInt();
            sc.nextLine();
            System.out.println("");
            System.out.print("mensaje para la persona "+(i+1)+": ");
            mensajes[i] = sc.nextLine();
            System.out.println("");
        }

        for(int i=0;i<3;i++){
            personas[i].saludar(mensajes[i]);
        }
        
        /*
        Persona persona = new Persona();
        persona.nombre="Juan";
        persona.edad=25;
        persona.saludar("mensaje 1");

        Persona otraPersona = new Persona();
        otraPersona.nombre="Maria";
        otraPersona.edad=30;
        otraPersona.saludar("mensaje 2");

        Persona TerceraPersona = new Persona();
        TerceraPersona.nombre="Sara";
        TerceraPersona.edad=30;
        TerceraPersona.saludar("mensaje 3");
        */

    sc.close();
    }
}
