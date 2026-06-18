package Condicionales;

import java.util.Scanner;

public class SwitchCase {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();
        switch (dia) {
            case 1, 7 -> System.out.println("Fin de semana");
            default -> System.out.println("Día laboral");
        }
    }
}
