/* Guia de POO. Ejercicio 07 Escribir un algoritmo que
determine si un número es numero primo
Materia: Programacion de Objetos*/

import java.util.Scanner;

public class Ejercicio7{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        /* Desde aqui empiza el desarrollo del ejercicio*/

        System.out.print("Ingrese un numero:");// ingreso de valor
        int nume = sc.nextInt();              // lectura de valor
        boolean band = true;                 // bandera de sentencia
        int i=2;                            // definicion de constante
        while(band==true && i<nume){       // proceso de y desarrolo del ejercicio
            if(nume%i == 0){
                band=false;
            } else{
                i++;
            }
        }
        if(band==true){
            System.out.println("El numero es primo");//impresion de resultado
        }else{
            System.out.println("El numero no es primo");// impresion de resultado
        }
    }
}

// Saul Vicente Gamez Oporto, Carnet 29-4048-2022