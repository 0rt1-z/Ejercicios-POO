/*Guia de POO. Ejercicio 09,Hacer un algoritmo que
imprima la secuencia de los numero Fibonacci
del 1 a N.
Materia: Programacion Orientada de Objeto*/

import java.util.Scanner;
public class Ejercicio9{
    public static void main (String [] args){

//Inicio de ejercicio
        Scanner teclado = new Scanner(System.in);
        int a=0, b =1, c, n;                                                        //Declaracion de variables
        System.out.print("Por favor ingrese cantidad de elementos para la serie:");// ingreso de numero de cuantos digitos sera la serie
        n= teclado.nextInt();                                                      // lectura de numero

        for (int i = 0; i < n; i++){                                              // proceso del ejercicio
            System.out.println(a);                                                  // impresion de ejercicio
            c = a +b;
            a = b;
            b = c;
        }
    }
}
//Saul Vicente Gamez Oporto, Carnet: 29-4048-2022