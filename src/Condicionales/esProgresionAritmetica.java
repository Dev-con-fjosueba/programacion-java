package Condicionales;

import java.util.Scanner;

/*
 * PROGRESIÓN ARITMÉTICA
 *
 * El programa debe:
 *
 * 1. Solicitar al usuario tres números enteros:
 *    - n1
 *    - n2
 *    - n3
 *
 * 2. Calcular la diferencia entre el segundo y el primer número:
 *    diferencia1 = n2 - n1
 *
 * 3. Calcular la diferencia entre el tercer y el segundo número:
 *    diferencia2 = n3 - n2
 *
 * 4. Comparar ambas diferencias.
 *
 * 5. Si las diferencias son iguales, los números forman una
 *    progresión aritmética.
 *
 * 6. En caso contrario, los números no forman una
 *    progresión aritmética.
 *
 * Ejemplos:
 *
 * Entrada:
 * 2 5 8
 * Salida:
 * Los números están en progresión aritmética.
 *
 * Entrada:
 * 3 7 12
 * Salida:
 * Los números no están en progresión aritmética.
 */
public class esProgresionAritmetica {
    /**
     * Verifica si tres números forman una progresión aritmética.
     *
     * @param primerNumero  primer término
     * @param segundoNumero segundo término
     * @param tercerNumero  tercer término
     * @return true si forman una progresión aritmética, false en caso contrario
     */
    static void main(String[] args) {
        // Definir variables
        int primerNumero;
        int segundoNumero;
        int terceroNumero;
        int diferencia1, diferencia2;
        boolean difereniasIguales = false;
        // Solicitar ingresar los datos
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese primer número: ");
        primerNumero= input.nextInt();
        System.out.println("Ingrese segundo numero: ");
        segundoNumero= input.nextInt();
        System.out.println("Ingrese tercero numero: ");
        terceroNumero= input.nextInt();
        // Evaluar si es progresión aritmética
        diferencia1=segundoNumero-primerNumero;
        diferencia2=terceroNumero-segundoNumero;
        difereniasIguales= (diferencia1==diferencia2);
        // Mostrar resultados
        if (difereniasIguales) {
            System.out.printf("Es una progresión aritmética con salto de %d en %d.", diferencia1, diferencia2);
        }else{
            System.out.printf("No es una progresión aritmétia.");
        }
    }
}
