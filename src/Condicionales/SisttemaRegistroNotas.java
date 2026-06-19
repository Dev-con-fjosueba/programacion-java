package Condicionales;

import java.util.Scanner;

public class SisttemaRegistroNotas {
    public static void main(String[] args) {
        // Declaramos variables
        String nombre = "";
        double nota1, nota2, nota3;
        double promedio;
        String resultado = "";
        // Solicitamos ingresar los datos
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre completo del estudiante:");
        nombre = scanner.nextLine().toUpperCase().trim();
        System.out.println("Ingrese la nota 1: ");
        nota1 = scanner.nextDouble();
        System.out.println("Ingrese la nota 2: ");
        nota2 = scanner.nextDouble();
        System.out.println("Ingrese la nota 3: ");
        nota3 = scanner.nextDouble();
        // Calculamos promedio
        promedio = (nota1 + nota2 + nota3) / 3;
        // Realizamos condiciones con switch
        if (promedio >= 0 && promedio < 10) {
            resultado = "DESAPROBADO";
        }else if (promedio >= 10 && promedio < 14) {
            resultado = "EN PROCESO";
        }else if (promedio >= 14 && promedio <=20) {
            resultado = "APROBADO";
        }
        String mostrarReporte = """
                **************************************
                            REPORTE DE NOTA
                **************************************
                Estudiante: %8s
                **************************************
                Nota 1: %10.2f
                Nota 2: %10.2f 
                Nota 3: %10.2f
                --------------------------------------
                Promedio: %10.2f
                **************************************
                Estado del estudiante: %15s
                **************************************
                """.formatted(nombre,nota1,nota2,nota3,promedio ,resultado);
        System.out.println(mostrarReporte);
        scanner.close();
    }
}
