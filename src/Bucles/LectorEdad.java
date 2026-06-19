package Bucles;

import java.util.Scanner;

/*
  • Escribir un programa para ingresar la edad de una persona .
  • Si el usuario ingresa una edad negativa, deberá pedirla nuevamente.
  • Si la edad no es negativa,deberá mostrar la edad ingresada .
* */
public class LectorEdad {
    public static void main(String[] args) {
        // Definimos variables
        int edad=-1; // Inicializamos con -1 para que ingrese al menos una vez al loop.
        Scanner scanner = new Scanner(System.in);
        // Solicitamos la edad en el loop. condición eedad <0 para que siga solicitanto ingresar la edad.
        while(edad<0){
            System.out.print("Ingrese el edad: ");
            edad = Integer.parseInt(scanner.nextLine()); // De esta manera evitamos limpiar cada que se repite el loop
        }
        // En caso sea edad>0 pasará a imprimir sin ingresar al loop, en caso la edad sea menor se mantendrá en el loop
        System.out.println("La edad ingresada es: " + edad);
    }
}
