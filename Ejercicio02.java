
/*Escribir un programa que indique si un número es múltiplo de 6*//
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);           //Declaracion de un objeto para el ingreso de datos
        int numero;                                         //Declaracion de la variable que guardara el numero a comparar

        System.out.print("Digite su numero:  ");            //Proceso de ingreso de datos
        numero = teclado.nextInt();

        if (numero % 6 == 0) {                                 //El programa realiza una division para verificar
            System.out.println("El numero es multiple de 6");  //si es un multiplo de 6
        } else {
            System.out.println("El numero no es multiple de 6"); //Este proceso se realiza si no es multiplo de 6
        }

    }
}

