/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rocio r
 */
public class EjercicioC {
    
    public static void main(String[] args) {
        int [] vector  = new int [] {12, 4,6,8}; 
        
            
             
        System.out.println("La suma es: " + suma(vector, 0));
        
    }
   
    
    
    
    public static int suma (int[] vector, int x) {
    int sum = 0;
    for (int i = 0; i < vector.length; i++) {
        if (vector[i] > x) {
            sum += vector[i];
        }
    }
    return sum;
}

    }
    

