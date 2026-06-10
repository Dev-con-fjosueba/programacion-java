package Condicionales;

import java.util.Scanner;

/*
* Una tienda acepta cambio de productos en los siguientes casos: si el producto
* tiene un precio entre 50 y 80 soles y fue comprado el día lunes (día 1) o si el
* producto tiene un precio no por debajo de 120 soles y fue comprado cualquier
* día, excepto miércoles o jueves (días 3 o 4, respectivamente). Evaluar si
* procede o no el cambio del producto. Las variables leídas son precioProducto
* y numeroDia.
* */
public class CambioProducto {
    public static void main(String[] args) {
        // Declaración de variables
        int precioProducto;
        int numeroDia;
        boolean primeraCondicion = false, segundaCondicion = false;
        Scanner input = new Scanner(System.in);
        //Solicitar datos
        System.out.printf("Ingrese el precio del producto: ");
        precioProducto = input.nextInt();
        System.out.printf("Ingresar número de día (Lunes [1]-Domingo [7]): ");
        numeroDia = input.nextInt();
        // check correspondientes
        primeraCondicion = (precioProducto>=50 && precioProducto<=80 && numeroDia==1);
        segundaCondicion = ((numeroDia==1 || numeroDia==2 || numeroDia==5 || numeroDia==6 || numeroDia==7) && precioProducto>=120);
        if (primeraCondicion || segundaCondicion) {
            System.out.println("Se acepta cambio del producto");
        }else{
            System.out.println("No se acepta cambio del producto");
        }
    }
}
