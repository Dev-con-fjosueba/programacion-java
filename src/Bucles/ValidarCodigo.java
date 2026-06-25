package Bucles;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarCodigo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Definimos la restricción de selección
        String regex="^U\\d{8}$";
        Pattern pattern = Pattern.compile(regex);
        boolean esValido = false; // Usamos centinela para el bucle
        while (!esValido){
            System.out.println("Digite su codigo: ");
            String codigo = scanner.nextLine();
            Matcher matcher = pattern.matcher(codigo);
            boolean cumple=matcher.matches();
            // Validamos que el código coincida con las restricciones
            if (cumple){
                System.out.println("Código valido. Acceso permitido. ");
                esValido=true;
            }else{
                System.out.println("Formato inválido. Acceso no permitido. Inténtelo nuevamente. ");
            }
        }
        scanner.close();
    }
}
