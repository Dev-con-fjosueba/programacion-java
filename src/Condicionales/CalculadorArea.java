package Condicionales;

import java.util.Scanner;

/*
 * ENUNCIADO:
 * - Escribe un programa en Java para crear una Calculadora de Áreas. Debe preguntarse al
 *   usuario por la figura (cuadrado, rectángulo, triángulo o círculo) y luego solicitar
 *   los datos para calcular su área.
 *
 * - Elegir una figura requiere ingresar el nombre completo o las tres primeras letras
 *   ("cuadrado" o "cua", por ejemplo).
 *
 * - Usa los métodos equals y contains de la clase String para validar el ingreso del usuario.
 */
public class CalculadorArea {
    public static void main(String[] args) {
        //Definimos variables
        double area = 0;
        final double PI = 3.1415;
        String nombreFigura = "";
        Scanner scanner = new Scanner(System.in);
        // Solicitar al usuario elegir la figura.
        System.out.println("CALCULADOR AREA DE FIGURAS");
        System.out.println("Elija una figura que desee calcular el área:");
        System.out.println("Opciones: triángulo, cuadrado, rectángulo o círculo");
        System.out.println("Ingresar el nombre o las tres primeras letras");
        // Leemos entrada, pasamos a minúscula y quitamos espacios extra.
        String figura = scanner.nextLine().toLowerCase().trim();
        // Realizamos validación por cada nombre
        if (figura.equals("triangulo") || figura.contains("tri")) {
            nombreFigura = "triángulo";
            System.out.println("Ingrese siguientes magnitudes:");
            System.out.print("Base: ");
            double base = scanner.nextDouble();
            System.out.print("Altura: ");
            double altura = scanner.nextDouble();
            area = (base * altura) / 2;
        } else if (figura.equals("cuadrado") || figura.contains("cua")) {
            nombreFigura = "cuadrado";
            System.out.println("Ingrese siguiente magnitud:");
            System.out.print("Longitud del lado: ");
            double lado = scanner.nextDouble();
            area = lado * lado;
        } else if (figura.equals("rectangulo") || figura.contains("rec")) {
            nombreFigura = "rectángulo";
            System.out.println("Ingrese siguientes magnitudes:");
            System.out.print("Base: ");
            double base = scanner.nextDouble();
            System.out.print("Altura: ");
            double altura = scanner.nextDouble();
            area = base * altura;
        } else if (figura.equals("circulo") || figura.contains("cir")) {
            nombreFigura = "círculo";
            System.out.println("Ingrese siguiente magnitud:");
            System.out.print("Radio:");
            double radio = scanner.nextDouble();
            area = PI * radio * radio;
        } else {
            // Terminamos el programa en caso ingrese un valor no permitido mostrando un mensaje de notificación
            System.out.println("la figura ingresada no es soportada ingrese una de las opciones válidas.");
            scanner.close();
            return;
        }
        // Imprimimos el resultado junto a la figura seleccionada de forma clara.
        System.out.printf("El área del %s es: %.2f", nombreFigura, area);
        scanner.close();
    }
}
