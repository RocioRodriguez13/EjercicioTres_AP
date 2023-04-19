
import java.util.Arrays;
import java.util.Scanner;


public class EjercicioUno {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        char orden;
        
        if (args.length == 4) {
            for (int i = 0; i < 3; i++) {
                numeros[i] = Integer.parseInt(args[i]);
            }
            orden = args[3].charAt(0);
        } else {
            // Punto b
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 3; i++) {
                System.out.print("Ingrese el número " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt();
            }
            System.out.print("Ingrese el orden (a para ascendente o d para descendente): ");
            orden = scanner.next().charAt(0);
        }

        if (orden == 'a') {
            Arrays.sort(numeros);
        } else if (orden == 'd') {
            Arrays.sort(numeros);
            for (int i = 0; i < numeros.length / 2; i++) {
                int temp = numeros[i];
                numeros[i] = numeros[numeros.length - 1 - i];
                numeros[numeros.length - 1 - i] = temp;
            }
        } else {
            System.out.println("Orden inválido");
            return;
        }

        System.out.print("Números ordenados: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }
}