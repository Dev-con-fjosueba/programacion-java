package Condicionales;

import java.util.Scanner;

/*
 * CÁLCULO DE LA HORA EN EL SIGUIENTE SEGUNDO
 *
 * Objetivo:
 * Determinar la hora exacta que corresponderá al siguiente segundo
 * a partir de una hora ingresada por el usuario.
 *
 * Datos de entrada:
 * - hora: valor entero entre 0 y 23.
 * - minuto: valor entero entre 0 y 59.
 * - segundo: valor entero entre 0 y 59.
 *
 * Validaciones:
 * - La hora debe estar en el rango [0, 23].
 * - Los minutos deben estar en el rango [0, 59].
 * - Los segundos deben estar en el rango [0, 59].
 *
 * Proceso:
 * 1. Leer las horas, minutos y segundos.
 * 2. Verificar que los valores ingresados sean válidos.
 * 3. Incrementar un segundo a la hora ingresada.
 * 4. Si los segundos alcanzan 60, reiniciarlos a 0 e incrementar
 *    los minutos.
 * 5. Si los minutos alcanzan 60, reiniciarlos a 0 e incrementar
 *    las horas.
 * 6. Si las horas alcanzan 24, reiniciarlas a 0.
 * 7. Mostrar la nueva hora resultante.
 *
 * Datos de salida:
 * - Hora, minuto y segundo correspondientes al siguiente segundo.
 *
 * Ejemplos:
 * Entrada: 10:25:30
 * Salida: 10:25:31
 *
 * Entrada: 14:59:59
 * Salida: 15:00:00
 *
 * Entrada: 23:59:59
 * Salida: 00:00:00
 */
public class HoraSiguienteSegundo {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Pedimos los datos
        System.out.println("Ingresa la hora [0-23]:");
        int hora = input.nextInt();
        System.out.println("Ingresa el minuto [0-59]:");
        int minuto = input.nextInt();
        System.out.println("Ingresa el segundo [0-59]:");
        int segundo = input.nextInt();
        //Validamos valor ingresado
        boolean tiempoValido= hora>=0 && hora<=23 && minuto>=0 && minuto<=59  && segundo>=0 && segundo<=59;
        if  (tiempoValido){
            segundo++;
            if(segundo==60){
                segundo=0;
                minuto++;
                if(minuto==60){
                    minuto=0;
                    hora++;
                    if(hora==24){
                        hora=0;
                    }
                }
            }
            System.out.printf("Tiempo en el siguiente segundo es: %02d : %02d : %02d\n",hora,minuto,segundo);
        }else{
            System.out.println("Uno de los valores del tiempo ingresado es incorrecto. Intente de nuevo. ");
        }
    }
}