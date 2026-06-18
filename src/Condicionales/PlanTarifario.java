package Condicionales;

import java.util.Scanner;

/*
 * =========================================================================
 * PLANTEAMIENTO DEL PROBLEMA
 * =========================================================================
 * Una tienda de celulares ofrece distintos planes tarifarios en función de
 * la marca que se compre, así como descuentos aplicados de acuerdo con el
 * plazo de pago promocional escogido.
 * * DATOS DE REFERENCIA:
 * * [Tabla 1: Planes por Marca]
 * - Motorola  : 29.90
 * - LG        : 36.00
 * - Samsung   : 46.80
 * - Huawei    : 62.00
 * - iPhone    : 71.00
 * * [Tabla 2: Descuentos por Plazo de Pago]
 * - A 6 meses  : 13.2%
 * - A 12 meses : 12.0%
 * - A 18 meses : 11.2%
 * * =========================================================================
 * REQUISITOS PARA ESTA ENTREGA
 * =========================================================================
 * 1. Solicitar Datos: El programa en Java debe pedir al usuario que ingrese
 * la marca del celular y el plazo de pago deseado.
 * 2. Cálculos y Salida: El programa debe calcular y mostrar en pantalla:
 * - El monto original del plan.
 * - El descuento que le corresponde (en dinero, basado en el porcentaje).
 * - El monto final a pagar.
 * 3. Validación de Errores: Se debe mostrar un mensaje de error explícito y
 * detener el proceso si alguna opción ingresada (marca o plazo) es incorrecta.
 */
public class PlanTarifario {
    public static void main(String[] args) {
        //Variables
        double montoOriginal = 0;
        double montoDescuento = 0;
        double montoFinal = 0;
        Scanner scanner = new Scanner(System.in);
        // Solicitamos ingresar los datos
        System.out.println("Ingresar la marca del móbil deseado.");
        String marca = scanner.nextLine().toLowerCase().trim(); // Limpiamos el texto ingresado
        System.out.println("Ingrese plazo de pago deseado");
        int plazo = scanner.nextInt();
        // switch pago de monto mensual
        double montoMensual = switch (marca) {
            case "motorola" -> 29.9;
            case "lg" -> 36.0;
            case "samsung" -> 46.8;
            case "huawei" -> 62.0;
            case "iphone" -> 71.0;
            default -> -1;
        };
        // switch porcentaje de descuento
        double porcentajeDescuento = switch (plazo) {
            case 6 -> 0.132;
            case 12 -> 0.120;
            case 18 ->  0.112;
            default -> -1;
        };
        if (montoMensual==-1 && porcentajeDescuento==-1) {
            System.out.println("La MARCA y el PLAZO ingresado es incorrecto.");
            scanner.close();
            return;
        }else if (porcentajeDescuento==-1) {
            System.out.println("El plazo ingresado es incorrecto.");
            scanner.close();
            return;
        }else if (montoMensual==-1) {
            System.out.println("La marca ingresada es incorrecta.");
            scanner.close();
            return;
        }
        // Cálculo de los montos
        montoOriginal = plazo * montoMensual;
        montoDescuento = montoOriginal * porcentajeDescuento;
        montoFinal = montoOriginal - montoDescuento;
        // Imprimimos reporte
        // Hacemos uso de TEXT BLOCKS y dibujamos la plantilla exactamente como queremos verla
        String reporte = """
                
                ======================================
                          REPORTE DE TARIFA
                ======================================
                Monto Original:  S/ %10.2f
                Monto Descuento: S/ %10.2f
                Monto Final:     S/ %10.2f
                ======================================
                """.formatted(montoOriginal, montoDescuento, montoFinal);

        System.out.print(reporte);
        scanner.close();
    }

}
