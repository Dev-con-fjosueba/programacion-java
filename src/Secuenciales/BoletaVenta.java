package Secuenciales;

import java.util.Scanner;

/*
 * BOLETA DE VENTA
 *
 * El programa debe:
 *
 * 1. Solicitar el nombre del cliente.
 *
 * 2. Solicitar los datos de DOS productos:
 *    - Nombre del producto
 *    - Precio unitario
 *    - Cantidad comprada
 *
 * 3. Calcular el subtotal de cada producto:
 *    subtotal = precio * cantidad
 *
 * 4. Calcular el subtotal general:
 *    subtotalGeneral = subtotalProducto1 + subtotalProducto2
 *
 * 5. Aplicar descuentos:
 *
 *    a) Si el nombre del cliente es "ANA" o "JUAN"
 *       (usando String.equals())
 *       aplicar un descuento del 5%.
 *
 *    b) Si el nombre de algún producto contiene
 *       la palabra "GAMER"
 *       (usando String.contains())
 *       aplicar un descuento adicional del 2%.
 *
 * 6. Calcular:
 *    - Descuento total
 *    - Total a pagar
 *
 * 7. Mostrar una boleta utilizando salida con formato
 *    (System.out.printf), por ejemplo:
 *
 *    ----------------------------------------
 *                 BOLETA DE VENTA
 *    ----------------------------------------
 *    Cliente: ANA
 *
 *    Producto            Cant   Precio   Subtotal
 *    Mouse Gamer           2     50.00    100.00
 *    Teclado               1     80.00     80.00
 *
 *    ----------------------------------------
 *    Subtotal:                    180.00
 *    Descuento:                    12.60
 *    Total a pagar:               167.40
 *    ----------------------------------------
 *
 */
public class BoletaVenta {
    public static void main(String[] args) {
        //Definimos variables}
        String nombreCliente, nombreProducto1, nombreProducto2;
        double precio1, precio2, subtotal1, subtotal2, subtotalGeneral, costoFinal, PrimerDescuento, SegundoDescuento,DescuentoTotal;
        int cantidad1, cantidad2;
        //Definimos constantes
        final double descuento1=0.05, descuento2=0.02;
        //Solicitamos ingresar datos
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre del cliente: ");
        nombreCliente = input.nextLine();
        // Primer producto
        System.out.println("Ingrese el nombre del producto: ");
        nombreProducto1 = input.nextLine();
        System.out.println("Ingrese el precio del producto: ");
        precio1 = input.nextDouble();
        System.out.println("Ingrese la cantidad del producto: ");
        cantidad1 = input.nextInt();
        input.nextLine();// Limpiamos buffer
        // Segundo producto
        System.out.println("Ingrese el nombre del producto: ");
        nombreProducto2 = input.nextLine();
        System.out.println("Ingrese el precio del producto: ");
        precio2 = input.nextDouble();
        System.out.println("Ingrese la cantidad del producto: ");
        cantidad2 = input.nextInt();
        //Calculamos subtotales
        subtotal1= precio1*cantidad1;
        subtotal2= precio2*cantidad2;
        // Calculamos total
        subtotalGeneral=subtotal1+subtotal2;
        PrimerDescuento=0;
        SegundoDescuento=0;
        if (nombreCliente.toUpperCase().equals("ANA") || nombreCliente.toUpperCase().equals("JUAN")){
            PrimerDescuento=subtotalGeneral*descuento1;
        }
        if(nombreProducto1.toUpperCase().contains("GAMER") || nombreProducto2.toUpperCase().contains("GAMER")){
            SegundoDescuento= subtotalGeneral*descuento2;
        }
        DescuentoTotal=PrimerDescuento+SegundoDescuento;
        costoFinal = subtotalGeneral-DescuentoTotal;
        System.out.printf("----------------------------------------\n");
        System.out.printf("              BOLETA DE VENTA           \n");
        System.out.printf("----------------------------------------\n");
        System.out.printf("Cliente: %s\n\n", nombreCliente);
        System.out.printf("----------------------------------------\n");
        System.out.printf("Producto:   Cantidad   Precio  Subtotal\n");
        System.out.printf("----------------------------------------\n");
        System.out.printf("%-15s %-7d %-7.2f %-7.2f%n\n",nombreProducto1,cantidad1,precio1,subtotal1);
        System.out.printf("%-15s %-7d %-7.2f %-7.2f%n\n",nombreProducto2,cantidad2,precio2,subtotal2);
        System.out.printf("\n\n\n");
        System.out.printf("----------------------------------------\n");
        System.out.printf("Subtotal:                     %10.2f\n",subtotalGeneral);
        System.out.printf("Descuento:                    %10.2f\n",DescuentoTotal);
        System.out.printf("Total a pagar:                %10.2f\n",costoFinal);
        System.out.printf("----------------------------------------\n");
    }
}
