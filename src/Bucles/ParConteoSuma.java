package Bucles;
/*
* • Escribir un programa que muestre los
    números pares menores a 20.
* • Contar cuántos números se mostraron y
    calcular la suma de todos ellos.
* */
public class ParConteoSuma {
    public static void main(String[] args) {
        // Definir variables
        int i=0;
        int par=0;
        int contador=0;
        int acumulador=0;
        System.out.println("Numeros pares menores a 20:");
        while (i<20){
            if (i%2==0){
                par=i;
                System.out.printf(" %d",par);
                contador=contador+1; //Contador aumenta +1 cacda que se cumple la condición
                acumulador+=par; //Acumulador suma el número que sea par cada que cumple la condición
            }
            i++;
        }
        System.out.printf("\nNúmero de pares: %d",contador);
        System.out.printf("\nSuma de pares: %d",acumulador);
    }
}
