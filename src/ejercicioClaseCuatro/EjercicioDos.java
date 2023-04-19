/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioClaseCuatro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjercicioDos {
	
       
       public static void main(String[] args) throws FileNotFoundException {
		File archivo = new File("C:\\Users\\rocio r\\Documents\\NombresClase4\\Numeros.txt");
		char op = 's';
		int resultado = sumar(archivo,op);
		System.out.println("\n El resultado es: "+ resultado);
	}

	private static int sumar(File arch, char op) throws FileNotFoundException {
		
		int producto=0, suma=0;
		boolean bandera1Entrada= true;
		
		Scanner sumaNumeros = new Scanner(arch);
		if (op == 's') {
		 System.out.println("Entra por suma: ");
		 while (sumaNumeros.hasNextInt()) { 		 
	            suma = suma + sumaNumeros.nextInt();
	            System.out.print(suma+" ");
		 } return suma;
		}

		else { 
			System.out.println("Entra por multiplicacion: ");
		     while (sumaNumeros.hasNextInt()) { 
		    	 if (bandera1Entrada) {
					 producto = sumaNumeros.nextInt(); // producto = producto *sumaNumeros.nexInt
					 bandera1Entrada = false;
				  }else
					  producto = producto * sumaNumeros.nextInt();
                         System.out.println(producto + " ");
       
       
                     }                     return producto;

                }
        }
}

