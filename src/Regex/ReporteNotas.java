package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* • Escribir un programa en Java que solicite al
    usuario las calificaciones de los estudiantes de
    un curso.
  • El programa termina cuando el usuario ya no
    desea ingresar más notas o cuando ingresa
    una nota igual a -1.
  • Al terminar, deberá mostrar el promedio global,
    así como el número de estudiantes aprobados
    y desaprobados.
* */
public class ReporteNotas {
    public static void main(String[] args) {
        // Definimos variabls
        int contador=0;
        double Suma=0;
        int contAprobado=0;
        int contDesaprobado=0;
        Scanner scanner = new Scanner(System.in);
        String regex="^(SI|si|SÍ|sí|Sí|NO|no|No)$";
        Pattern pattern = Pattern.compile(regex);
        boolean continuar = true;
        while(continuar){
            System.out.println("Ingrese una nota a registrar: ");
            double nota= Double.parseDouble(scanner.nextLine());
            //Agregamos restricción
            if (nota==-1){
                System.out.println("codigo culminación forzado del programa...");
                continuar=false; // Culminamos bucle pedir notas.
                continue;
            } else if (nota>=0 && nota<=20) {
                if(nota>=11){
                    contAprobado=contAprobado+1;
                } else{
                    contDesaprobado=contDesaprobado+1;
                }
            }else{
                System.out.println("El valor de nota ingresado no es válido. intentelo nuevamente");
                continue;
            }
            // Validamos resuesta a pregunta de continuar
            boolean seguir=true;
            String opcion="";
            while(seguir){
                System.out.println("¿registrar otra nota?");
                opcion=scanner.nextLine();
                Matcher matcher = pattern.matcher(opcion);
                if(matcher.matches()){
                    seguir=false; // Si la respuesta es correcta terminamos bucle
                }else{
                    System.out.println("Respuesta ingresada incorrectamente. Intente de nuevo.");
                }
            }
            if(opcion.equalsIgnoreCase("no")){
                System.out.println("Terminando el programa...");
                continuar=false; // Culminamos el boocle de pedir notas
            }
            contador=contador+1; //Contamos pra saber cuantas notas ingresó para poder saxcar promedio posteriormente
            Suma+=nota; // Sumamos las notas ingresadas
        }
        if(contador>0){
            double promedio=Suma/contador;
            String reporte= """
                ******************************************
                        REPORTE DE NOTA DEL AULA:
                *****************************************
                Promedio:       %8.2f
                Aprobados:      %8d
                Desaprovados:   %8d
                *****************************************
                """.formatted(promedio,contAprobado,contDesaprobado);
            System.out.println(reporte);
            scanner.close();
        }else{
            System.out.println("No se ingresó ninguna nota.");
        }

    }
}
