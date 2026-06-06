package Fundamentos;

import java.util.Scanner;

/*
    - Escribe un programa que calcule la distancia que recorre la luz
      en N días, sabiendo que en un segundo la luz viaja a 299792458 m/s.
    - Leer el número de días utilizando la clase Scanner.
    - Crear una constante para almacenar la velocidad de la luz.
    - Muestra el resultado utilizando salida con formato.
*/
public class DistanciaViajeLuz {
    public static void main(String[] args) {
        // Definimos variables
        long NumeroDias, Segundos, Distancia;
        final long VelocidadLuz = 299792458;
        // Solicitar ingresar datos
        System.out.println("Ingresa el número de días: ");
        Scanner input = new Scanner(System.in);
        NumeroDias = input.nextInt();
        //Convertimos días en segundos
        Segundos = NumeroDias*24*3600;
        //Calculamos distancia
        Distancia = VelocidadLuz*Segundos;
        //Mostramos resultado utilizando formato
        System.out.printf("La distancia de viaje en %d días es: %d metros.", NumeroDias, Distancia);

    }
}
