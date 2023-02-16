import java.util.Scanner;                           //Se importa el package scanner de java

public class Ejercicio03 {
    public static void main(String []args){
        Scanner teclado = new Scanner(System.in);   //Declaracion de un objeto para el ingreso de datos
        int numero;                                 //Declaracion de variable que guardara nuestro dato de ingreso

        System.out.println("Ingrese un numero: ");  //Proceso de ingreso de datos
        numero = teclado.nextInt();

        if ( numero % 2 == 0 ){                              //nuestra condicion realizara una division para
            System.out.println(numero+ "Es un Numero Par"); //verificar si es un numero par
        }
        else {
            System.out.println(numero+ "No es un Numero Par");//Este proceso se realiza si la condicion no se cumple
        }
    }
}
