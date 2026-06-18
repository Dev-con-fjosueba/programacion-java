package Condicionales;

import java.util.Locale;
import java.util.Scanner;

/*
    Se pide un programa de cambio de moneda a soles, dolares o euros.
    Entrada:
    - Moneda de origen
    - Moneda de destino
    - monto a convertir
    Salida:
    - Moneda convertida
* */
public class CambioMoneda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // agregamos useLocale(Locale.US) para que no tenga problemas al inresar un punto en ves de coma.
        System.out.printf("Ingrese La moneda de origen: D: Dolares, S:Soles: E: Euros\n");
        String origen = scanner.nextLine();
        origen = origen.toUpperCase(); // Convertimos a mayuscula para evitar errores en caso de que ingrese minúscula.
        System.out.printf("Ingrese La moneda de destino: \n");
        String destino = scanner.nextLine();
        destino = destino.toUpperCase();
        System.out.println("Monto a convertir:\n");
        double monto = scanner.nextDouble();
        double montoCambiado=0; // Inicializamos variabke monto cambiado
        // Realizamos proceso con switch y ve los primeros 3 casos de origen.
        switch (origen) {
            case "D" -> {
                if (destino.equals("D")) {
                    montoCambiado = monto;
                }else if (destino.equals("S")) {
                    montoCambiado = monto/3.82;
                }else if (destino.equals("E")) {
                    montoCambiado = (3.82* monto) / 4.17;
                }
            }
            case "S" -> {
                if (destino.equals("D")) {
                    montoCambiado = monto/3.82;
                }else if (destino.equals("S")) {
                    montoCambiado = monto;
                }else if (destino.equals("E")) {
                    montoCambiado = monto / 4.17;
                }
            }
            case "E" -> {
                if (destino.equals("D")) {
                    montoCambiado = (3.82 * monto) / 4.17;
                }else if (destino.equals("S")) {
                    montoCambiado = 4.17 * monto;
                }else if (destino.equals("E")) {
                    montoCambiado = monto;
                }
            }
            default -> System.out.println("Error: Moneda de origen o destino incorrecto.");
        }
        System.out.printf("Convertir %.2f en %s a %s es %.2f ",monto,origen,destino,montoCambiado);
        scanner.close();
    }
}
/* Como reflexión en caso de ser más monedas se optaría por convertir los valores de origen a una unica amoneda
   con un switch y pasar ese valor a otro switch destino que realiza el cambia. haciendo dos procesos:
   convertir en un switch la moneda origen a un tipo de moneda y dicho valor será cambiado en el otro switch que será destino.
 */