/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rocio r
 */
public class EjercicioA {

    public static void main(String[] args) {
 String palabra = "apolo";
 int contador = 0;
 int posicion = 0;
 char caracter = 'a';
 String palabra_minu = palabra.toLowerCase();
 
 posicion = palabra_minu.indexOf(caracter);
        if (posicion !=1) {
//            System.out.println("Posicion: "+ posicion);
            
            while (posicion != -1){
            contador ++;
           posicion = palabra.indexOf(caracter, posicion +1);
//                System.out.println(posicion + "posicion" + "");
                   
            }
            
            System.out.println("El caracter "+ caracter + " aparece " + contador + " vez" );
        }
                     

        
        
    }    }
 
