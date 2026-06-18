package Condicionales;

import java.util.Scanner;

public class puntuacionPostulante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la puntuación del candidato:");
        int puntuacion = scanner.nextInt();
        String descripcion = switch (puntuacion){
            case 0, 1, 2, 3, 4 -> "Descartado";
            case 5 -> "En suspenso";
            case 6 -> "Aceptable";
            case 7, 8 -> "Aceptado";
            case 9, 10 -> "Sobresaliente";
            default ->  "Rango de puntuación ingresado es invalido.";
        };
        System.out.println("Descripcion: " + descripcion);
        scanner.close();
    }
}
