/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioClaseCuatro;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
/**
 *
 * @author rocio r
 */
public class EjercicioTres {
    

	public static void main(String[] args) {
		
		Path ruta = Paths.get("C:\\Users\\rocio r\\Documents\\NombresClase4\\Nombres.txt");
		try {
			Files.write(ruta, "\"Adrián, Adriana, Alejandro, Alejandra, José, Josefina,Julio, Julia, Julieta,Roma\"".getBytes());
			List < String > ContenidoArchivo = Files.readAllLines(ruta, StandardCharsets.UTF_8);
			ContenidoArchivo.forEach(line -> System.out.println(line));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error en el archivo");
		}
		


	}

}
