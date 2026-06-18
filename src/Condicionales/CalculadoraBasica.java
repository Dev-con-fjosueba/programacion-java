package Condicionales;

import java.util.Locale;
import java.util.Scanner;

/*
 * =========================================================================
 * PRÁCTICA - EJERCICIO CALCULADORA BÁSICA
 * =========================================================================
 * ENUNCIADO DEL PROGRAMA
 * =========================================================================
 * Escribir un programa en Java que muestre un menú y lea un tipo de
 * operación (suma, resta, multiplicación, división) y dos
 * números a operar. Mostrar el resultado de la operación realizada.
 * Si se ingresa un tipo de operación no válido, mostrar el mensaje
 * "operación no soportada".
 */
public class CalculadoraBasica {
    public static void main(String[] args) {
        // Definimos variables
        double valor1, valor2, resultado;
        String nombreOpcion="";
        String signo="";
        // Solicitamos los datos
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        String menuOpciones = """
                ===========================================
                ||            CALCULADORA BASICA         ||
                ===========================================
                ||    1) SUMA                            ||
                ||    2) RESTA                           ||
                ||    3) MULTIPLICACION                  ||
                ||    4) DIVISION                        ||
                ===========================================
                ||   Elige la operación a realizar       ||
                ===========================================
                """;
        System.out.println(menuOpciones);
        int opcion = scanner.nextInt();
        System.out.println("Ingrese el primer valor:");
        valor1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo valor:");
        valor2 = scanner.nextDouble();
        resultado = switch (opcion) {
        case 1 -> {
            nombreOpcion = "SUMA";
            signo = "+";
            resultado = valor1 + valor2;
            yield  resultado;
        }
        case 2 -> {
            nombreOpcion = "RESTA";
            signo = "-";
            resultado = valor1 - valor2;
            yield  resultado;
        }
        case 3 -> {
            nombreOpcion = "MULTIPLICACION";
            signo = "*";
            resultado = valor1 * valor2;
            yield  resultado;
        }
        case 4 -> {
            nombreOpcion = "DIVISION";
            signo = "/";
            resultado = valor1 / valor2;
            yield  resultado;
        }
            default -> -1;
        };
        if (resultado == -1) {
            System.out.println("La operación ingresada es incorrecta. Ingrese una operación permitida");
            scanner.close();
            return;
        }
        String respuesta = """
                ===========================================
                    Operación realizada: %s
                ===========================================
                         %.2f %s %.2f
                ===========================================
                    Resultado: %.2f
                ===========================================
                """.formatted(nombreOpcion,valor1,signo,valor2,resultado);
        System.out.println(respuesta);
        scanner.close();
    }
}

