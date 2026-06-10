package Condicionales;
/**
 * EJERCICIO 1: Cálculo de aumento salarial de altos funcionarios
 * * Contexto:
 * El gobierno ha decretado un aumento en los salarios de los altos
 * funcionarios de acuerdo con la siguiente escala:
 * * Tabla de Porcentajes de Aumento:
 * -------------------------------------------------------
 * | Sexo       | Salud      | Educación   | Transporte  |
 * -------------------------------------------------------
 * | Femenino   | 25%        | 12%         | 20%         |
 * | Masculino  | 20%        | 11%         | 15%         |
 * -------------------------------------------------------
 * * Salarios Base Actuales:
 * - Sector Salud      : S/. 15,000
 * - Sector Educación  : S/. 12,000
 * - Sector Transporte : S/. 18,000
 * * Requerimiento Técnico:
 * Escribir un programa en Java que solicite por consola el sexo y
 * el sector de un funcionario, evaluando los datos ingresados para
 * calcular e imprimir el monto total que recibirá luego de aplicado
 * el aumento correspondiente.
 */
import java.util.Scanner;

public class aumentoSalario {
    static void main(String[] args) {
        //Definimos constantes
        final double MASCULINO_SALUD=0.20;
        final double FEMENINO_SALUD=0.25;
        final double MASCULINO_EDUCACION=0.11;
        final double FEMENINO_EDUCACION=0.12;
        final double MASCULINO_TRANSPORTE=0.15;
        final double FEMENINO_TRANSPORTE=0.20;
        final int SALUD_SALARIO= 15000;
        final int EDUCACION_SALARIO= 12000;
        final int TRANSPORTE_SALARIO= 18000;
        double salarioBase=0;
        double aumentoSalario=0;
        double nuevoSalario=0;
        Scanner input = new Scanner(System.in);
        // Solicitamos los datos
        System.out.println("Ingrese su sexo [M : Masculino ó F: Femenino]");
        String sexo = input.next();
        System.out.println("Igrese su sector de trabajo: ");
        String sector = input.next();
        //Declaramos condiciones
        if (sexo.toUpperCase().equals("M")) {
            if (sector.toUpperCase().equals("SALUD")) {
                salarioBase = SALUD_SALARIO;
                aumentoSalario = SALUD_SALARIO*MASCULINO_SALUD;
                nuevoSalario = SALUD_SALARIO+aumentoSalario;
                System.out.println("\n--- Resumen de Planilla ---");
                System.out.printf("\nSalario Actual  : S/. %f", salarioBase);
                System.out.printf("\nMonto de Aumento: S/. %f",aumentoSalario);
                System.out.printf("\nNuevo Salario   : S/." + nuevoSalario);
                System.out.println("\n---------------------------");
            } else if (sector.toUpperCase().equals("EDUCACION")) {
                salarioBase = EDUCACION_SALARIO;
                aumentoSalario = EDUCACION_SALARIO*MASCULINO_EDUCACION;
                nuevoSalario = EDUCACION_SALARIO+aumentoSalario;
                System.out.println("\n--- Resumen de Planilla ---");
                System.out.printf("\nSalario Actual  : S/. %f", salarioBase);
                System.out.printf("\nMonto de Aumento: S/. %f",aumentoSalario);
                System.out.printf("\nNuevo Salario   : S/." + nuevoSalario);
                System.out.println("\n---------------------------");
            }else if (sector.toUpperCase().equals("TRANSPORTE")) {
                salarioBase = TRANSPORTE_SALARIO;
                aumentoSalario = TRANSPORTE_SALARIO*MASCULINO_TRANSPORTE;
                nuevoSalario = TRANSPORTE_SALARIO+aumentoSalario;
                System.out.println("\n--- Resumen de Planilla ---");
                System.out.printf("\nSalario Actual  : S/. %f", salarioBase);
                System.out.printf("\nMonto de Aumento: S/. %f",aumentoSalario);
                System.out.printf("\nNuevo Salario   : S/." + nuevoSalario);
                System.out.println("\n---------------------------");
            }else{
                System.out.println("Usted no pertenece al sector con aumento de salario disponible.");
            }
        } else if (sexo.toUpperCase().equals("F")) {
            if (sector.toUpperCase().equals("SALUD")) {
                salarioBase=SALUD_SALARIO;
                aumentoSalario = SALUD_SALARIO*FEMENINO_SALUD;
                nuevoSalario = SALUD_SALARIO+aumentoSalario;
                System.out.println("\n--- Resumen de Planilla ---");
                System.out.printf("\nSalario Actual  : S/. %f", salarioBase);
                System.out.printf("\nMonto de Aumento: S/. %f",aumentoSalario);
                System.out.printf("\nNuevo Salario   : S/." + nuevoSalario);
                System.out.println("\n---------------------------");
            } else if (sector.toUpperCase().equals("EDUCACION")) {
                salarioBase=EDUCACION_SALARIO;
                aumentoSalario = EDUCACION_SALARIO*FEMENINO_EDUCACION;
                nuevoSalario = EDUCACION_SALARIO+aumentoSalario;
                System.out.println("\n--- Resumen de Planilla ---");
                System.out.printf("\nSalario Actual  : S/. %f", salarioBase);
                System.out.printf("\nMonto de Aumento: S/. %f",aumentoSalario);
                System.out.printf("\nNuevo Salario   : S/." + nuevoSalario);
                System.out.println("\n---------------------------");
            }else if (sector.toUpperCase().equals("TRANSPORTE")) {
                salarioBase=TRANSPORTE_SALARIO;
                aumentoSalario = TRANSPORTE_SALARIO*FEMENINO_TRANSPORTE;
                nuevoSalario = TRANSPORTE_SALARIO+aumentoSalario;
                System.out.println("\n--- Resumen de Planilla ---");
                System.out.printf("\nSalario Actual  : S/. %.2f", salarioBase);
                System.out.printf("\nMonto de Aumento: S/. %.2f",aumentoSalario);
                System.out.printf("\nNuevo Salario   : S/.%.2f",nuevoSalario);
                System.out.println("\n---------------------------");
            }else{
                System.out.println("Usted no pertenece al sector con aumento de salario disponible.");
            }
        }else{
            System.out.println("Sexo ingresado incorrecto. Intente nuevamente.");
        }

        input.close();
    }
}
