import java.util.Scanner;                                   //Se importa el package scanner de java

/*1. Escribir un programa que indique cuál es el mayor de cuatro números
    enteros.*/
public class Ejercicio01 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);      //Declaracion de un objeto para el ingreso de datos
        int numero1,numero2,numero3,numero4;           //Definicion de de las 4 variables

        System.out.println("Ingrese su Primer numero"); //Proceso de ingreso de datos
        numero1 = teclado.nextInt();
        System.out.println("Ingrese su segundo numero"); //Proceso de ingreso de segundo dato
        numero2 = teclado.nextInt();
        System.out.println("Ingrese su Tercer numero");  //Proceso de ingreso de tercer dato
        numero3 = teclado.nextInt();
        System.out.println("Ingrese su Cuarto numero");  //Proceso de ingreso de cuarto dato
        numero4 = teclado.nextInt();

        if(numero1>numero2 && numero1>numero3 && numero1>numero4){
            System.out.println("El numero mayor es: "+numero1);
        }
        else if (numero2>numero1 && numero2>numero3 && numero2>numero4){
            System.out.println("El numero mayor es: "+numero2);

        } else if (numero3>numero1 && numero3>numero2 && numero3>numero4){
            System.out.println("El numero mayor es: "+numero3);

        } else if (numero4>numero1 && numero4>numero2 && numero4>numero3){
            System.out.println("El numero mayor es: "+numero4);            
        }
        else{
            System.out.println("Todos los numeros son iguales");
        }
    }
}

