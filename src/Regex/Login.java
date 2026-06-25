package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    • Escribir un programa en Java que pida una dirección de
      correo y una clave de acceso. Mostrar “Acceso denegado”
      mientras el correo no cumpla con el formato correcto
      (clases Pattern & Matching) o mientras la clave ingresada
      sea diferente de “P@55w0rd”. Haga uso del bucle while.
    • Si se ingresan las credenciales correctas se mostrará
      “Bienvenido al sistema” y el programa termina.
    • El número máximo de intentos es 3. Si el usuario excede el
      límite se mostrará “Cuenta suspendida” y el programa
      termina.
* */
public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regexCorreo = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$"; // Expresion para validar correo
        Pattern patternCorreo = Pattern.compile(regexCorreo);
        int contIntentos = 0;
        int intentosRestantes;
        boolean accesoConcedido = false;
        // El bucle iniciará mientras el usuario tenga intentos permitidos y el acceso concedido se mantenga en false
        while (contIntentos<3 && !accesoConcedido) {
            // Solicitamos ingresar el correo y la contraseña
            System.out.print("CORREO: ");
            String correoIngresado = scanner.nextLine();
            System.out.print("CONTRASEÑA:");
            String contrasena = scanner.nextLine();
            // Validamos que el correo y contraseña ingresada
            Matcher matchCorreo = patternCorreo.matcher(correoIngresado);
            boolean correoValido = matchCorreo.matches();
            boolean contrasenaValido = contrasena.equals("P@55w0rd");
            // Validamos el correo y la contraseña. Si son válidos actualiza el acceso concedido a true para terminar e bucle
            if (correoValido && contrasenaValido) {
                System.out.println("Bienvenido al sistema");
                accesoConcedido = true;
            }
            // En caso no se cumpla los requisitos para el LOGIN aumenta el contador, calcula intentos restantes e imprime mensajes necesarios
            else {
                contIntentos++;
                intentosRestantes = 3 - contIntentos;
                System.out.println("Acceso denegado.");
                System.out.printf("intentos Restantes: %d\n",intentosRestantes);
            }
        }
        // En caso se haya excedido los 3 intentos permitidos mostramos siguiente mensaje
        if (!accesoConcedido) {
            System.out.println("Cuenta suspendida.");
        }
        scanner.close();
    }
}
