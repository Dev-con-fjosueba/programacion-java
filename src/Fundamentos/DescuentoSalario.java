/*
    Contexto:
    Se pide un programa .java que permita calcular el salario neto.
    Como dato de entrada se le da el salario bruto y se debe descontar
    el 15% por aporte AFP y el 3.5% por seguro médico. Finalmente dar como salida
    el monto de salario neto.

    ENTRADAS:
        - Salario bruto
    PROCESO:
        - Calcular aporte AFP
        - Calcular monto por concepto de seguro
        - Calcular saslario neto (se pasas a hacer el descuento de los montos de aporte a el salario bruto).
    SALIDA:
        - Mostrar en pantalla el monto del salario neto.
 */

import java.util.Scanner;

public class DescuentoSalario {
    public static void main(String[] args) {
        //Declaramos variables
        double SalarioBruto, SalarioNeto, AporteAFP, AporteSeguro;
        // Librería necesaria para pedir datos
        Scanner entrada = new Scanner(System.in);
        // Definimos constantes
        final double AFP = 0.15;
        final double Seguro = 0.035;
        // Pedimos ingresar datos
        System.out.println("*** CALCULAMOS SALARIO NETO ***");
        System.out.println("Ingrese el monto del salario bruto: ");
        SalarioBruto = entrada.nextDouble();
        //Cálculo de edescuentos correspondientes
        AporteAFP = SalarioBruto * AFP;
        AporteSeguro = SalarioBruto * Seguro;
        SalarioNeto = SalarioBruto - AporteAFP - AporteSeguro;
        System.out.printf("Salario Neto: %.2f soles.", SalarioNeto);
    }
}
