/*Guia POO. Ejercicio 08
Hacer un algoritmo que determine la cantidad a pagar de N productos
Materia Porgramacion Orientada de Objeto*/
import java.util.Scanner;


public class Ejercicio8{
    public static void main(String args[]){

        int totalpagar = 0; // declaracion de constante
        Scanner scanner = new Scanner(System.in);

// Inicio del ejercicio

        System.out.println("Ingrese la cantidad de productos:");// ingreso de numero de productos
        int cantidad = scanner.nextInt();                       // leer cantidad de productos
        for (int i=1; i<=cantidad;i++){                         // operaciones

            System.out.println("Ingrese el precio del producto:");  // ingreso de precio de los productos
            int precioproducto=scanner.nextInt();                   // declaracion de variable
            totalpagar=totalpagar+precioproducto;                   // opercion de productos y precios
        }
        System.out.println("Total a canlelar es:"+totalpagar);   // impresion final del ejercicio
    }
}
//Saul Vicente Gamez Oporto, Carnet:29-4048-2022