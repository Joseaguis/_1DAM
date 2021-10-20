package _02Ejemplos;

import java.util.Scanner;

public class _09Strings {
	public static void main(String[] args) {
		//Crear Strings
		String nombre1 = new String("Pepe");
		nombre1 = new String("Luis");
		nombre1 = "Ana";
		
		
		String nombre2 = "Pablo";
		
		//Leer desde teclado
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Nombre completo: ");
		String nombreCompleto = tec.nextLine(); //Leemos toda la linea
		System.out.println("Nombre completo: " + nombreCompleto);
		
		System.out.println("Alias: ");
		String alias = tec.next(); //leemos la primera palabra
		System.out.println("Alias: " + alias);
	
	
	}
}
