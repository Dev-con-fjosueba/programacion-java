package Condicionales;

import java.util.Scanner;

/*
 * EVALUACIÓN DE ELEGIBILIDAD PARA JUBILACIÓN
 *
 * Objetivo:
 * Determinar si una persona cumple con la edad mínima requerida
 * para acceder a la jubilación según su sexo.
 *
 * Datos de entrada:
 * - sexo: sexo de la persona (M para masculino, F para femenino).
 * - edad: edad de la persona en años.
 *
 * Reglas de negocio:
 * - Los hombres pueden jubilarse si tienen 65 años o más.
 * - Las mujeres pueden jubilarse si tienen 60 años o más.
 *
 * Proceso:
 * 1. Leer el sexo y la edad de la persona.
 * 2. Evaluar la condición correspondiente según el sexo.
 * 3. Verificar si la edad cumple con el requisito mínimo de jubilación.
 * 4. Mostrar el resultado de la evaluación.
 *
 * Datos de salida:
 * - Mensaje indicando si la persona puede o no jubilarse.
 *
 * Ejemplos:
 * Entrada: sexo = M, edad = 67
 * Salida: La persona puede jubilarse.
 *
 * Entrada: sexo = F, edad = 58
 * Salida: La persona no puede jubilarse.
 */
public class evaluarJubilacion {
    static void main(String[] args) {
        // Solicitamos datos
        System.out.printf("Ingrese su sexo: ");
        Scanner input = new Scanner(System.in);
        String sexo = input.nextLine();
        System.out.printf("Ingrese su edad: ");
        int edad = input.nextInt();
        if (sexo.toUpperCase().equals("M")){
            if (edad>=65){
                System.out.printf("La persona puede jubilarse");
            }else {
                System.out.printf("La persona no puede jubilarse");
            }
        }else if (sexo.toUpperCase().equals("F")){
            if (edad>=60){
                System.out.printf("La persona puede jubilarse");
            }else  {
                System.out.printf("La persona no puede jubilarse");
            }
        }else {
            System.out.printf("Ingrese su sexo M: masculino ó F: femenino");
        }
    }
}
