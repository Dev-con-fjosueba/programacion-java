package Condicionales;
/*
=======================================================================
RETO NIVEL 3: Sistema de Facturación "GlobalMarket"
=======================================================================
Contexto: Calcular el total a pagar de una compra aplicando descuentos
y costos de envío según el tipo de cliente, destino y monto.

DATOS DE ENTRADA:
- tipo_cliente ("Premium" o "Regular")
- destino ("Nacional" o "Internacional")
- monto_compra (Número decimal)

REGLAS DE NEGOCIO:
1. CLIENTE "Premium":
   - Si destino es "Nacional": Envío gratis ($0).
     * Anidada: Si monto_compra > $100, aplicar 10% de descuento al monto.
   - Si destino es "Internacional": Envío $15.
     * Anidada: Si monto_compra > $200, el envío es gratis ($0).

2. CLIENTE "Regular":
   - Si destino es "Nacional": Envío $5.
     * Anidada: Si monto_compra < $20, recargo de $2 (envío total $7).
   - Si destino es "Internacional": Envío $25.
     * Anidada: Si monto_compra < $50, MOSTRAR ERROR ("Las compras
       internacionales deben ser de al menos $50") y detener proceso.

SALIDA ESPERADA:
Imprimir un recibo detallado que incluya:
- Monto de la compra original
- Descuento aplicado (si corresponde)
- Costo de envío
- Total a pagar (Monto - Descuento + Envío)
=======================================================================
*/
import java.util.Scanner;

public class SistemaFacturacionLogistica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Pedir datos
        System.out.println("Sistema Facturacion Logistica\n");
        System.out.println("Ingresar su tipo de suscripción P: Premium ó R: Regular");
        String suscripcion = input.nextLine();
        System.out.println("Ingrese lugar de destino N: Nacional ó I: Internacional");
        String destino = input.nextLine();
        System.out.println("Ingrese monto total de compra en dolares: ");
        double montoCompra = input.nextDouble();
        double envio = 0;
        double descuento = 0;
        // Condiciones
        if (suscripcion.toUpperCase().equals("P")) {
            if (destino.toUpperCase().equals("N")) {
                envio = 0;
                if (montoCompra > 100) {
                    descuento = montoCompra * 0.1; // 10% es el porcentaj de descuento por ser compra mayor a 100 dolares
                }
            } else if (destino.toUpperCase().equals("I")) {
                envio = 15;
                if (montoCompra > 200) {
                    envio = 0;
                }
            } else {
                System.out.println("El destino ingresado es incorrecto.");
            }
        } else if (suscripcion.toUpperCase().equals("R")) {
            if (destino.toUpperCase().equals("N")) {
                envio = 5;
                if (montoCompra < 20) {
                    envio = envio + 2;
                }
            } else if (destino.toUpperCase().equals("I")) {
                envio = 25;
                if (montoCompra < 50) {
                    System.out.println("Las compras internacionales deben ser de al menos $50");
                    return; // Terminamos el programa como se nos solicita.
                }
            } else {
                System.out.println("El destino ingresado es incorrecto.");
            }
        } else {
            System.out.println("Ingrese su tipo de suscripción correctamente.");
        }
        double montoPagar = montoCompra - descuento + envio;
        System.out.println("\n========================================");
        System.out.println("          RECIBO DE DETALLE              ");
        System.out.println("========================================");

        // %-25s alinea el texto a la izquierda dándole 25 espacios fijos.
        // %10.2f alinea el número a la derecha dándole 10 espacios fijos.
        System.out.printf("%-25s $%10.2f\n", "Monto de la compra:", montoCompra);

        if (descuento != 0) {
            // Si hay descuento, le agregamos un signo de menos (-) para que sea visualmente claro
            System.out.printf("%-25s-$%10.2f\n", "Descuento aplicado:", descuento);
        }

        System.out.printf("%-25s $%10.2f\n", "Costo de envío:", envio);
        System.out.println("----------------------------------------");
        System.out.printf("%-25s $%10.2f\n", "Total a pagar:", montoPagar);
        System.out.println("========================================\n");
    }
}
