package _02Ejemplos;

import java.util.Scanner;

public class _01TipoBoolean {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Edad: ");
		int edad = sc.nextInt();
		
		boolean mayorEdad = edad >= 18;
		System.out.println("¿Puede conducir?: " + mayorEdad);
		
		if (edad >= 18) System.out.println("Puede conducir");
		else System.out.println("No puede conducir");
		
		if(mayorEdad)System.out.println("Puede conducir");
		else System.out.println("No puede conducir");
		
		if(mayorEdad == true)System.out.println("Puede conducir");
		else System.out.println("No puede conducir");
		
		if((puedeConducir(edad))) System.out.println("Puede conducir");
		else System.out.println("No puede conducir");
		
		sc.close();
	}
	
	public static boolean puedeConducir(int edad) {
		boolean puede;
		
		if(edad >= 18) puede = true;
		else puede = false;
		
		return puede;
	}
}