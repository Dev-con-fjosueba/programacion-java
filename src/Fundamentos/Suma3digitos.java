import java.util.Scanner;

/*
    RETO SEMANA 1:
    - Escribir un programa en Java que solicite un
      número entero de tres cifras y muestre la suma de
      sus dígitos.
    - Mostrar el reporte formateado como se indica. Por
      ejemplo, si el usuario ingresa 235, la suma de sus
      dígitos es 10, y deberá mostrarse el mensaje:
      “la suma de 2 + 3 + 5 = 10”
    - Indicar adicionalmente si el número ingresado tuvo
      o no tres cifras.
    ENTRADAS:
    - Número de 3 cifras.
    PROCESO:
    - Separar dígitos.
    - Sumar dígitos.
    - Validar si se ingresó número de 3 cifras.
    SALIDA:
    - Mostar mensaje de salida similar a: “la suma de 2 + 3 + 5 = 10”.
    - Mostrar validadción si el número ingresado fue de 3 cifras.
 */
public class RetoSemana1 {
    public static void main(String[] args) {
        // Declaramos variables
        int Numero3cifras, cifra1, cifra2, cifra3,SumaCifras;
        boolean Es3cifras;
        //Solicitamos ingresar número
        System.out.println("Ingrese un número de 3 cifras: ");
        Scanner input = new Scanner(System.in);
        Numero3cifras = input.next();
        // Extraemos cada dígito.
        cifra1 = Numero3cifras%10; //Extraemos primer dígito de la derecha
        Numero3cifras= Numero3cifras/10; // Actualizamos el número
        cifra2 = Numero3cifras%10;
        cifra3= Numero3cifras/10;
        //Calculamos suma de cifras
        SumaCifras= cifra1+cifra2+cifra3;
        //Evaluamos si es 3 cifras
        Es3cifras = (Numero3cifras >=100 && Numero3cifras <=1000);
        //Imprimimos resultados
        System.out.printf("La suma de %d + &d + %d = %d",cifra1,cifra2,cifra3,SumaCifras);
        System.out.println("El numero ingresado es de 3 cifras: "+Es3cifras);
    }
}