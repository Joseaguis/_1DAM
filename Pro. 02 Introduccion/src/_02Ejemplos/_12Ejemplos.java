package _02Ejemplos;

import java.util.Scanner;

public class _12Ejemplos {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Equals para comprobar si un string e igual que otro

		System.out.println("Nombre: ");
		String nombre = sc.next();
		String nombre2 = sc.next();
		
		if (nombre.equals("pepe")) {
			System.out.println("Te llamas pepe");
		}else {
			System.out.println("No te llamas pepe");
		}
		
		System.out.println(nombre.toUpperCase());	
		//Transforma todo en mayuscula
		
		System.out.println(nombre.toLowerCase()); 
		//Transforma todo en minuscula
		
		System.out.println(nombre.charAt(0));		
		//Obtienes el caracter de la posición indicada
		//Si introduces un dato que no existe da error
		
		System.out.println(nombre.indexOf(106));	
		//Te da el numero de index de la palabra
		
		System.out.println(nombre.substring(2));	
		//substrae una cantidad de caracteres de terminada (empezando por el principio)
		
		System.out.println(nombre.trim());			
		//Si aparece un dato que no esta en la tabla o espacios inecesarios, lo elimina,
		
		
		
	}
}