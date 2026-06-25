package Bucles;
/*
*   • Escribir un programa en Java para solicitar un número
      repetidamente mientras éste se encuentre entre 1 y 100.
    • Ingresado un valor válido, el programa continúa si el
      usuario responde Sí a “¿Desea continuar? (Sí/No)”. Si
      contesta No, el programa termina.
    • Validar las diferentes respuestas con una expresión
      regular (No, no, NO, si, Si, sí, SÍ, Sí) dentro de un bucle
      while.
      (Clases Pattern & Matching)
* */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarRangoIngresado {
    public static void main(String[] args) {
        int numero;// Declaramos la variable numero a ingresar
        boolean continuar = true;
        Scanner scanner = new Scanner(System.in);
        String regex = "^(SI|si|SÍ|sí|Sí|NO|no|No)$";
        Pattern pattern = Pattern.compile(regex);
        while (continuar) {
            System.out.println("Ingrese un número permitido en el rango (1-100): ");
            numero = scanner.nextInt();
            if (numero >= 1 && numero <= 100) {
                // Validamos que la respuesta sea valida
                boolean respuestaValida = false;
                String respuesta="";
                scanner.nextLine();
                // realizamos bucle validador de una respuesta adecuada (SI/NO).
                while (!respuestaValida) {
                    System.out.println("¿Desea continuar? (Sí/No)");
                    respuesta = scanner.nextLine();
                    Matcher matcher = pattern.matcher(respuesta);
                    if (matcher.matches()) {
                        respuestaValida = true; //Salimos del bucle validador
                    }else{
                        System.out.println("Respuesta no valida. Inténtelo de nuevo.");
                    }
                }
                // Verificamos que la respuesta ingresada sea "no" en cualquiera de las formas y así finalizar el programa
                if (respuesta.equalsIgnoreCase("no")) {
                    System.out.println("Finalizando programa...");
                    continuar = false;
                }
            } // Finalizamos el programa en caso no se encuentre en el rango indicado
            else {
                System.out.println("Número fuera de rango. Finalizando programa...");
                continuar = false;
            }
        }
        scanner.close();
    }
}
