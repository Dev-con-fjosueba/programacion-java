package Bucles;

import java.util.Scanner;

/*
* • Escribir un programa que
    permita ingresar el día de
    la semana en valor
    numérico (del 1 al 7).
  • Si se ingresa otro valor, el
    programa deberá
    solicitarlo nuevamente.
* */
public class Centinela {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean esDiaValido = true;
        int dia = 0;
        while(esDiaValido){
            System.out.println("Ingrese el dia de la semana: (1-7)");
            dia = scanner.nextInt();
            scanner.nextLine();
            esDiaValido = (dia<1 || dia>7);
        }
        System.out.println("El día ingresado es: " + dia);
    }
}
